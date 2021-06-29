package myapp.util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;



public class PrinterApp {
	public static void print(String conteudo, File dir, String fileName) throws Exception {
		File file = new File(dir, fileName);
		print(conteudo, dir, file);
	}
	public static void print(String conteudo, File dir, File file) throws Exception {
		if (!dir.exists());
			dir.mkdirs();
		
		Path path = new File(dir, file.getName()).toPath();
		Files.write(path, conteudo.getBytes());
		}
}
