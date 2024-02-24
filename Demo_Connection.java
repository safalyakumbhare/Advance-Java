// package New_Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo_Connection{

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			Statement smt = con.createStatement();
			smt.executeUpdate("create table stud(Stud_Name varchar(12) , Stud_Roll int not null, Stud_Fees number)");
			
			System.out.println("Table Created Succesfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}

}
