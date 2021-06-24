package myapp.cadastro;

public class Cadastro {
	
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	private Endereco endereco;
	private String cpfCnpj; //99.999.999/0001-01
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
		public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco end) {
		this.endereco = end;
	}
	
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Long getTelefone() {
		return telefone;
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
	private Integer getId() {
		return id;
	}
	private void setId(Integer id){
		this.id = id;
	}
	
}