import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoDelete = "DELETE FROM pessoas WHERE id = ?";		
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoDelete);
			
			preparedStatement.setInt(1, 30);
			preparedStatement.executeUpdate();
			
			System.out.println("ID deletado com sucesso");
			
						
		} catch (Exception execption) {
			execption.printStackTrace();
		}
	}

}
