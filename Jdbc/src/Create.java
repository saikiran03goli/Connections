import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ojava","ojava");
			Statement stmt=con.createStatement();


			int i=stmt.executeUpdate("create table Example(id number(10),name varchar2(30),address varchar2(30) , salary number(10,2))");

		
			System.out.println("Table Created");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
