import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main
{

	public static void main(String[] args)
	{
		Connection connect = null; 
		 Statement s = null;

		try
		{

			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("test");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/Ketsrp?user=root&password=root");
			//System.out.println("test2");
			   s = connect.createStatement();

			if (connect != null) {
			    System.out.println("Database Connected.");
			    String sql = "INSERT INTO customers "
			            + "(id, name,email,salary) "
			            + "VALUES ('2004','hong hyok','hong@sdtc.ac.th','150000') ";
			    s.execute(sql);
			    System.out.println("Record Inserted Successfully");
			} else {
			    System.out.println("Database Connect Failed.");
			}

		} catch (Exception e)
		{

			e.printStackTrace();

		}

		try
		{

			if (connect != null)
			{

				connect.close();

			}

		} catch (SQLException e)
		{

			e.printStackTrace();

		} // TODO Auto-generated method stub


	}
}
