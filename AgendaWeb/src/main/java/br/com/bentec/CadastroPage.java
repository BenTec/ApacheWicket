/**
 * 
 */
package br.com.bentec;

import org.apache.wicket.markup.html.basic.Label;

/**
 * @author joeljhimmy
 * 
 * 
 * Classe referente a  tela de Cadastro de novas pessoas da Agenda Web
 * Toda componente wicket tem um objeto Java.
 */
public class CadastroPage extends BasePage{


	private static final long serialVersionUID = -7661984562582864226L;
	
	
	public CadastroPage() {
		add(new Label("cadastro", "Adicionar novo cliente"));
	}
	
}
