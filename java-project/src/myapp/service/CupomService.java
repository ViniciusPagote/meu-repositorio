package myapp.service;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import myapp.cadastro.Empresa;
import myapp.cadastro.Endereco;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class CupomService {
	public static String gerarCupom(Pedido pedido) {
		
	Empresa empresa = pedido.getEmpresa();
	
	System.out.println(empresa.getCadastro().getEndereco());
	
	StringBuilder sb = new StringBuilder();
	
	Endereco e = empresa.getCadastro().getEndereco();
	String cep = e.getCep().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2-$3" );
	
	sb.append(empresa.getCadastro().getNome() + "\n");
	sb.append(String.format("%s\n", "-".repeat(65)));
	sb.append(String.format("%s, %s, %s - %s - %s Cep: %s  \n",e.getLogradouro(), e.getNumero(), e.getBairro(), e.getCidade(),e.getUf(),cep ));
	sb.append(String.format("CNPJ: %s \n", empresa.getCadastro().getCpfCnpj().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})"), "$1.$2.$3/$4-$5" )));
	sb.append(String.format("IE: %s\nIM: %s\n",empresa.getIe().toString().replaceAll( ("(\\d{3})(\\d{3})(\\d{3})"), "$1.$2.$3" ), empresa.getIm().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2.$3" )));
	sb.append(String.format("%s\n", "-".repeat(65)));
	
	//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
	// Calendario atual + hora atual 
	
	Date hoje = new Date();
	String relogio = DateFormat.getInstance().format(hoje);
	String calendario = DateFormat.getInstance().format(hoje);
	
		relogio = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		calendario = DateFormat.getDateInstance(DateFormat.SHORT).format(hoje);
		String dataFormatada = calendario + " " + relogio; //sb.append(calendario +" "+relogio +"\n");
	sb.append(String.format("%-40s CCF:%07d CCO:%07d", dataFormatada, pedido.getCcf(), pedido.getCoo()) + "\n" ); // %06d = o ZERO indica o numero que deve ser preenchido e o SEIS quantidades de numeros
	sb.append(String.format("%s\n", "-".repeat(65)));
	
	List<PedidoItem> itens = pedido.getItens();
	
	sb.append(String.format("%-35s%10s%10s%10s  \n", "ITEM","QTD","R$ UNIT", "R$ TOTAL"));
	for(PedidoItem i : itens) {
		String q = String.format("%.2f", i.getQuantidade());
		String vu = String.format("%.2f", i.getValorVenda());
		String vt = String.format("%.2f", i.getValorTotal());
		
		sb.append(String.format("%-35s%10s%10s%10s \n",i.getProduto().getTitulo(), q,vu,vt));
		}
	
	sb.append(String.format("%s\n", "-".repeat(65)));
	sb.append(String.format("%58s %.2f\n", "TOTAL R$", pedido.getValorTotal()));
	
	//System.out.println(sb.toString());
	return sb.toString();
}
}

