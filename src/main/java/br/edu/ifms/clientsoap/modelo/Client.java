package br.edu.ifms.clientsoap.modelo;

/* 
maven-archetype-quickstart

CREATE TABLE client (
	id bigserial NOT NULL, 
	firstName character varying(200), 
	lastName character varying(200),
	email character varying(200),
	phone character varying(200),  
	CONSTRAINT noticia_pk PRIMARY KEY (id) 
);
*/

public class Client {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Client() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
