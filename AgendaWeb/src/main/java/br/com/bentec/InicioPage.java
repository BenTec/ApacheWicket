/**
 * 
 */
package br.com.bentec;

import org.apache.wicket.markup.html.basic.Label;

/**
 * @author Joelhimmy
 *
 * Página inicial da aplicação - Agenda WEB
 * 
 */
public class InicioPage extends BasePage{

	private static final long serialVersionUID = -5238607441959888810L;
	
	private final String mensagem = "Bem vindo a sua Agenda Web!";
	
	public InicioPage() {
		add(new Label("idMensagemTitulo", mensagem));
	}
	
}
