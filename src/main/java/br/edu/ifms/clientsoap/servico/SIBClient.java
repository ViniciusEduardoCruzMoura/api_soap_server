package br.edu.ifms.clientsoap.servico;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import jakarta.jws.WebService;

import br.edu.ifms.clientsoap.dao.ClientDao;
import br.edu.ifms.clientsoap.dao.ClientDaoImpl;
import br.edu.ifms.clientsoap.modelo.Client;
import br.edu.ifms.clientsoap.util.Conexao;

@WebService(endpointInterface = "br.edu.ifms.clientsoap.servico.SEIClient")
public class SIBClient implements SEIClient {

	@Override
	public boolean adicionar(Client client) {
		Connection con = Conexao.getConnection(); 
		ClientDao dao = new ClientDaoImpl(con);
		try {
			return dao.adicionar(client);
		} catch (Exception e) {
			e.printStackTrace();
            return false;
		}
	}

	@Override
	public List<Client> listar() {
		Connection con = Conexao.getConnection(); 
		ClientDao dao = new ClientDaoImpl(con);
		try {
			return dao.listar();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Client>();
		}
	}

}
