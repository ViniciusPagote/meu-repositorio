package digytal.dao;

import java.sql.Connection;
import digytal.jdbc.connection.FabricaConexao;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
			FabricaConexao fc = new FabricaConexao();
			cnn = fc.criarConexao();
		}
		public void incluir() {
		}
			
		public void alterar() {
		}
		
}