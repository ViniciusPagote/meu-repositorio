package myapp;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import myapp.cadastro.Empresa;
import myapp.cadastro.Endereco;
import myapp.pedidos.Pedido;
import myapp.pedidos.PedidoItem;

public class PrinterApp {
	public static void print(String conteudo, File file) {
	try {
		file.createNewFile();
		FileWriter arq = new FileWriter (file.getPath());
		PrintWriter gravar = new PrintWriter (arq);
		
		gravar.print(conteudo);
		arq.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
