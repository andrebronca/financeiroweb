package financeiro.web;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UsuarioBean {
	private String nome;
	private String email;
	private String senha;
	private String confirmaSenha;
	
	public String novo() {
		//por hora não há nada aqui, mas pode ser utilizado para iniciar algum campo
		//para salvar dados posteriormente.
		return "usuario";
	}
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(!this.senha.equalsIgnoreCase(this.confirmaSenha)) {
			context.addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"Senha confirmada incorretamente", ""));
			return "usuario";
		}
		//as palavras: usuario, sucesso serão configuradas no arquivo: faces-config.xml
		return "sucesso";
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
