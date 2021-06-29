package myapp.util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReaderApp {
	public static List<String> ler(File dir, String fileName) throws Exception {
		Path path = new File(dir,fileName).toPath();
		return Files.readAllLines(path);
	}
}
