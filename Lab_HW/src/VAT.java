
public class VAT
{
	
	public double a;
	
	public double salary(double salary)
	{
		int Year;
		Year = (int) (salary * 12);
		return Year;
		
	}
	public double CalVat(double salary)
	{
		double Vat = (salary * 7) / 100;
		return Vat;


	}
	
	
	
	

}
