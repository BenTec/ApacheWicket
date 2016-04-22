/**
 * 
 */
package br.com.bentec.contato;

import java.io.Serializable;

/**
 * @author joeljhimmy
 * 
 * Classe que representará as informações,
 * do cadastro de contatos.
 *
 */
public class Contato  implements Serializable{


	private static final long serialVersionUID = 8099786261032194934L;
	
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+this.nome+"\n"+"E-mail: "+this.email+"\n"+"Telefon: "+this.telefone;
	}
}
