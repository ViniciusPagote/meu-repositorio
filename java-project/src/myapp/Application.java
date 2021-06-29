package myapp;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import myapp.cadastro.CD;
import myapp.cadastro.Cadastro;
import myapp.cadastro.Empresa;
import myapp.cadastro.Endereco;
import myapp.factory.FabricaCadastro;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;
import myapp.service.CupomService;
import myapp.util.PrinterApp;
import myapp.util.ReaderApp;

public class Application {
	public static void main(String[] args) {
	
		Cadastro artista = FabricaCadastro.criarCadastro("BRUCE DICKSON", "a@a", 989089090L);
			
		CD p1 = new CD(); 
		p1.setCodigoBarras("989789789");
		p1.setTitulo("IRON MAIDEN");
		p1.setValorVenda(199.90);
		p1.setFaixa(10);
		p1.setArtista(artista);
		
		artista = FabricaCadastro.criarCadastro("PINK FLOYD", null, 989089090L);
		
		CD p2 = new CD(); 
		p2.setCodigoBarras("989789789");
		p2.setTitulo("THE WALL");
		p2.setValorVenda(157.90);
		p2.setFaixa(8);
		p2.setArtista(artista);
		
		
		Empresa empresa = new Empresa(172648678l, 98765432l);
		Cadastro cadEmpresa = new Cadastro();
		cadEmpresa.setCpfCnpj("12345678000101"); 
		cadEmpresa.setEmail("pedidos@ifood.com");
		cadEmpresa.setNome("IFOOD PEDIDOS");
		cadEmpresa.setTelefone(11987654321L);
		empresa.setCadastro(cadEmpresa);
		
		Endereco end = new Endereco();
		end.setBairro("Ipiranga");
		end.setCep("04223070");
		end.setCidade("São Paulo");
		end.setUf("SP");
		end.setLogradouro("Rua Silva Bueno");
		end.setNumero("S/N");
		cadEmpresa.setEndereco(end);
		
		
		Pedido pedido = new Pedido();
		pedido.setEmpresa(empresa);
		Cadastro comprador = FabricaCadastro.criarCadastro("VINICIUS", "teste@gmail", 45618514L);
		
		pedido.setComprador(comprador);
		pedido.setData(new Date(2021,6,16));
		pedido.setValorTotal(325.0);
		pedido.setId(23234);
		pedido.setCcf(25);
		pedido.setCoo(280);
		
		List<PedidoItem> itens = new ArrayList<>();
		PedidoItem item = new PedidoItem();
		item.setProduto(p1);
		item.setQuantidade(2.0);
		item.setValorVenda(p1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		item= new PedidoItem();
		item.setProduto(p2);
		item.setQuantidade(4.0);
		item.setValorVenda(p2.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		pedido.setItens(itens);
		
		String conteudo = CupomService.gerarCupom(pedido);
		 
		File dir = new File("D:\\DESENVOLVIMENTO\\mjv\\meu-repositorio\\cupom");
		try {
			//PrinterApp.print(conteudo, dir, "cupom.txt");
			CupomService.gerarPedidos(dir, "pedidos.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
