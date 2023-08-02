import java.sql.*;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ojava","ojava");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("update Example set name='sai',salary='35000'where id=102");
			System.out.println("Values Updated");
			con.close();
			
		}
catch(Exception e) {
	System.out.println(e);
}
	}

}
