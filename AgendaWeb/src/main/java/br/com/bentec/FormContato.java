/**
 * 
 */
package br.com.bentec;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

import br.com.bentec.contato.Contato;

/**
 * @author joeljhimmy
 * 
 * Cada componente do wicket necessita de um model,
 * um objeto de interface do wicket que se relaciona com um objeto
 * da regra de negocio. 
 * 
 * Para criar o formulário será necessário criar um objetos do Tipo TextField
 * e adicionálos a um Objeto Form.
 * 
 * O CompoundPropertyModel é responsável por relacionar os atributos do Objeto com
 * os Componentes do Wickets
 *  
 */
public class FormContato extends BasePage{

	private static final long serialVersionUID = 5773460316465535008L;
	
	public FormContato(){
		
		add(new Label("titulo", "Novo Contato"));
		
		Contato contato = new Contato();
		CompoundPropertyModel<Contato> model = new CompoundPropertyModel<Contato>(contato);
		
		Form<Contato> form = new Form<Contato>("formularioContato", model){

			private static final long serialVersionUID = 7901195864691061443L;
			
			@Override
			protected void onSubmit() {
				Contato contato = getModelObject();
				System.out.println("Contato para salvar : "+ contato);
				setResponsePage(InicioPage.class);
			}
			
		};
		add(form);
		
		TextField<Contato> inputNome = new TextField<Contato>("nome");
		TextField<Contato> inputEmail = new TextField<Contato>("email");
		TextField<Contato> inputTelefone = new TextField<Contato>("telefone");
		form.add(inputNome, inputEmail, inputTelefone);
		
	}
		
}
