
public class MainCal
{

	public static void main(String[] args)
	{
		Calculater c = new Calculater();
		c.a=5;
		c.b=10;
		
		
		System.out.println("total Square : "+c.square(c.a, c.b));
		
		c.multiply();
	}

}
