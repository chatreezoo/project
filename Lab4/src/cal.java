
public class cal
{

	public int x, y, z;

	public void Mul()
	{
		y = 2;
		for (x = 1; x <= 12; x++)

		{
			z = x * y;
			System.out.println(y + " * " + x + " = " + z);
		}
	}

	public void add(int a, int b)
	{
		z = a + b;
		System.out.println(a + " + " + b + " = " + z);
	}

	public int OddEven()
	{
		x = 11;
		if (x % 2 == 0)
		{
			return x;
		} else
		{
			return 1;
		}
	}
	
	public double Grade(int s1,int s2,int Mid, int Final)
	{
		return s1+s2+Mid+Final;
	}

}
