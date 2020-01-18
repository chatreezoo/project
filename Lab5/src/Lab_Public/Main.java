package Lab_Public;

public class Main
{

	public static void main(String[] args)
	{
		public_emp emp = new public_emp();
		System.out.println(String.format("Current Saraly is : %,.2f", emp.saraly));
		
		emp.saraly=24000.0f;
		System.out.println(String.format("New Saraly is : %,.2f", emp.saraly));
		//OT
		System.out.println(String.format("Over Time is : %,.2f", emp.ot(5, 50)));

	}

}
