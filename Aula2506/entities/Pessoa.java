package entidades;

public class Pessoa {
	private String id;
	private String nome;
	private String email;
	private String tel;
	private String cpf;
	public Pessoa() {
		id = null;
		nome = "";
		email = "";
		tel = "";
		cpf = "";
	}
	public Pessoa(String id, String nome, String email, String tel, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tel = tel;
		this.cpf = cpf;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
		
}
