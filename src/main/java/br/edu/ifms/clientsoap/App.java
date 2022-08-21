package br.edu.ifms.clientsoap;

import br.edu.ifms.clientsoap.servico.SIBClient;
import jakarta.xml.ws.Endpoint;

public class App 
{
    public static void main( String[] args )
    {
    	String porta = "8088";
		System.out.println("Publicando o serviço na porta: " + porta);
		Endpoint.publish("http://localhost:"+porta+"/clientsoap", new SIBClient());
		System.out.println("Serviço publicado na porta: " + porta);
    }
}
