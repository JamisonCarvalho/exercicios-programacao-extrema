import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoUpdate = "UPDATE pessoas SET nome=? WHERE ID=?";
		final String instrucao_insert = "INSERT INTO Pessoas(id, nome) VALUES(?,?)";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			//PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoUpdate);
			preparedStatement.setString(1, "Tiana");			
			preparedStatement.setInt(2, 20);
			
			preparedStatement.executeUpdate();
			
			
			System.out.println("Alteração realizada com sucesso");
			//System.out.println("Inclusão realizada com sucesso");
						
		} catch (Exception execption) {
			execption.printStackTrace();
		}
	}

}
