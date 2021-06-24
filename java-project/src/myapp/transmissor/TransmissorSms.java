package myapp.transmissor;

import java.util.Date;

public class TransmissorSms extends TransmissorMensagem{

	public TransmissorSms(Date data) {
		super(data);
	}
	
	@Override
	public void enviar(String mensagem) {
	}
}