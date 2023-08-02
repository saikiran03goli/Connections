import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ojava","ojava");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into Example values(103,'SaiKiran Reddy','30000')");
			System.out.println("Values Inserted");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
