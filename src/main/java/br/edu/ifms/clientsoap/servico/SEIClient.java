package br.edu.ifms.clientsoap.servico;

import java.util.List;

import br.edu.ifms.clientsoap.modelo.Client;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding (style = Style.DOCUMENT)
public interface SEIClient {
	
	@WebMethod
	boolean adicionar(Client noticia);
	
	@WebMethod
	List<Client> listar();

}
