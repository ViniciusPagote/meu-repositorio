package myapp.util;

public class FormatUtil {
	public static String formatCnpj(String cnpj) {
		String textoFormatado = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		return textoFormatado;
	}
	public static String formatCpf(String cpf) {
		String textoFormatado = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
		return textoFormatado;
	}
	public static String formatCpfCnpj(String cpfCnpj) {
	
		if(!ValidatorUtil.isCpfCnpj(cpfCnpj)) {
			System.err.println("ERRO CPF");
			return "CPF FORMATO ERRADO";
		}
		
		if(cpfCnpj.length()==ValidatorUtil.MAX_CPF) { 
			return formatCpf(cpfCnpj);
		}
		else
		return formatCnpj(cpfCnpj);		
	}
	public static void main(String[] args) {
		System.out.println(formatCpfCnpj("12345678912"));
		System.out.println(formatCpfCnpj("1234567891247"));
	}
}