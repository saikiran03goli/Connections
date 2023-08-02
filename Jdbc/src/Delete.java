import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ojava","ojava");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("delete from example where id=101");
			System.out.println("Values deleted");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
