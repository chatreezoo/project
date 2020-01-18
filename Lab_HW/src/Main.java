import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		VAT v = new VAT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz input Salary: ");
		v.a = sc.nextDouble();
		System.out.println("Your have salary per year: " + v.salary(v.a));

		if (v.salary(v.a) <= 150000)
		{
			System.out.println("YOUR DON'T PAY VAT ");
		}
		else {
			
			System.out.println("Your have VAT: " + v.CalVat(v.salary(v.a)));
		}
		double total = v.salary(v.a)-v.CalVat(v.salary(v.a));
		System.out.println("Total revenue actually received per year: "+total);

	}

}
