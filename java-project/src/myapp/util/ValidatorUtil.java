package myapp.util;

public class ValidatorUtil {
	public static final int MAX_CPF=11;
	public static boolean isCnpj(String cnpj) {
		return cnpj.matches("\\d{14}");
	}
	public static boolean isCpf(String cpf) {
		return cpf.matches("\\d{11}");
	}
	public static boolean isCpfCnpj(String cpfCnpj) {
		return isCnpj(cpfCnpj) || isCpf(cpfCnpj);
	}
}