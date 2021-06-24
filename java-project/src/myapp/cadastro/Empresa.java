package myapp.cadastro;

public class Empresa {
	private Cadastro cadastro;
	private Long im; //999.999.999
	private Long ie;//99.999.99
	
	public Empresa(Long ie,Long im ) {
		this.im = im;
		this.ie = ie;
	}
	
	public Long getIm() {
		return im;
	}
	
	public Long getIe() {
		return ie;
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;

	}
	
	
}