package br.edu.ifms.clientsoap.dao;

import java.sql.SQLException;
import java.util.List;

import br.edu.ifms.clientsoap.modelo.Client;

public interface ClientDao {
	
	public boolean adicionar(Client client) throws SQLException;
	public List<Client> listar() throws SQLException;

}
