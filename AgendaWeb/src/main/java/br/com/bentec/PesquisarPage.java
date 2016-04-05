/**
 * 
 */
package br.com.bentec;

import org.apache.wicket.markup.html.basic.Label;

/**
 * @author joeljhimmy
 *
 * Classe para a página de pesquisa de contados da Agenda Web
 * 
 */
public class PesquisarPage extends BasePage {


	private static final long serialVersionUID = -2663815087960984773L;
	
	public PesquisarPage() {
		add(new Label("pesquisar", "Pesquisar Nomes Agenda"));
	}
}
