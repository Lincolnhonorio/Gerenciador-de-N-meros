package contato;

public class Contact {

	private String nome;
	private String telefone;
	private String email;
	
	
	public Contact(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Contact [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
}
