package myapp.cadastro;

public class CD extends Produto {
	private Cadastro artista;
	private Integer faixa;
	public Cadastro getArtista() {
		return artista;
	}
	public void setArtista(Cadastro artista) {
		this.artista = artista;
	}
	public Integer getFaixa() {
		return faixa;
	}
	public void setFaixa(Integer faixa) {
		this.faixa = faixa;
	}
	
}