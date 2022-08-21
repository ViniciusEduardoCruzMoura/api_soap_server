package br.edu.ifms.clientsoap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifms.clientsoap.modelo.Client;

public class ClientDaoImpl implements ClientDao {
	
	private Connection connection;
	
	public ClientDaoImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public boolean adicionar(Client client) throws SQLException {
		PreparedStatement stmt = null;
		try {
			String sql = "insert into client (firstName, lastName, email, phone) values (?,?,?,?)";
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, client.getFirstName());		
			stmt.setString(2, client.getLastName());
			stmt.setString(3, client.getEmail());
			stmt.setString(4, client.getPhone());
			stmt.execute();			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt.close();
		}
		return false;
	}

	@Override
	public List<Client> listar() throws SQLException {
		ArrayList<Client> list = new ArrayList<Client>();
		Statement stmt = null;
		try {
			String sql = "select * from client";
			stmt = this.connection.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			
			while (rs.next()) {
				Client client = new Client();
				client.setId(rs.getLong("id"));
				client.setFirstName(rs.getString("firstName"));
				client.setLastName(rs.getString("lastName"));
				client.setEmail(rs.getString("email"));
				client.setPhone(rs.getString("phone"));
				list.add(client);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt.close();
		}
		return list;
	}

}
