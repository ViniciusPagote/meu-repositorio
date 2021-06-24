package myapp.transmissor;

import java.util.Date;

abstract class TransmissorMensagem {
	
	private Date data;

	public TransmissorMensagem(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void enviar(String mensagem) {
		
	}
}