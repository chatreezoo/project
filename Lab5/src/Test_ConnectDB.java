import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Test_ConnectDB
{

	public static void main(String[] args)
	{
		Connection connect = null;

		try
		{

			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("test");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/Ketsrp?user=root&password=root");
			//System.out.println("test2");

			if (connect != null)
			{

				System.out.println("Database Connected.");

			} else
			{

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
