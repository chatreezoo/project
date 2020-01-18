import java.util.*;
import java.lang.String;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println(
				"=================================================================================================================");
		Scanner sc = new Scanner(System.in);
		for (;;)
		{

			System.out.print("Please enter a Password: ");
			int password = sc.nextInt();

			if (password == 12345)
			{
				int[] x = new int[10];
				for (int i = 0; i <= 9; i++)
				{
					System.out.println(
							"\n=================================================================================================================");
					System.out.print("ป้อนตัวเลขที่ " );
					x[i] = sc.nextInt();

					System.out.print(" = " + x[i]);

				}
				System.out.println(
						"\n=================================================================================================================");

				evenodd eo = new evenodd();
				int Size, i;
				int evenCount = 0, oddCount = 0;

				Size = 10;

				int[] a = new int[Size];
				for (i = 0; i < Size; i++)
				{
					a[i] = x[i];
				}

				evenCount = eo.CountEven(a, Size);
				oddCount = eo.CountOdd(a, Size);
				System.out.println("\nมีเลขคู่ " + evenCount + " ตัว");
				System.out.println("มีเลขคี่ " + oddCount + " ตัว");

				System.out.println(
						"=================================================================================================================");
				System.out.println("Plot Graph");
				plotgraph pg = new plotgraph();
				int e, o;
				int[] k = new int[Size];
				for (i = 0; i < Size; i++)
				{
					k[i] = x[i];
				}
				e = pg.CountEven(k, Size);
				o = pg.CountOdd(k, Size);
				System.out.println(
						" \n=================================================================================================================");
				// evensum +=
				int es, os;
				es = eo.evensum(a, Size);
				os = eo.oddsum(a, Size);

				System.out.println(
						" \n=================================================================================================================");
				System.out.println("Press any key to continue...");
				System.out.println(
						" \n=================================================================================================================");

				int b, y, z;
				for (b = 2; b <= 12; b++)
				{
					for (y = 1; y <= 12; y++)
					{
						z = b * y;
						System.out.println(b + " * " + y + " = " + z);
					}
					System.out.println("Press any key to continue...");
				}
				System.out.println(
						" \n=================================================================================================================");

				int numbers[] = new int[]{2,4,6,8,10};
			      int s = numbers[0];
			      int l = numbers[0];
			      
			      for(int p = 1; p < numbers.length; p++) {
			         if(numbers[p] > l)l = numbers[p];
			         else if (numbers[p] < s)s = numbers[p];
			      } 
			      int numbers1[] = new int[]{1,3,5,7,9};
			      int s1 = numbers1[0];
			      int l1 = numbers1[0];
			      
			      for(int p = 1; p < numbers1.length; p++) {
			         if(numbers1[p] > l1)l1 = numbers1[p];
			         else if (numbers1[p] < s1)s1 = numbers1[p];
			      } 
			     
			      System.out.println("เลขคู่ที่มีค่าน้อยที่สุดคือ " + s+" และเลขคู่ที่มีค่ามากที่สุดคือ " + l);
			      System.out.println("เลขคี่ที่มีค่าน้อยที่สุดคือ " + s1+" และเลขคี่ที่มีค่ามากที่สุดคือ " + l1);
			
				System.out.println(
						" \n=================================================================================================================");
				System.exit(0);

			} else
			{
				int num;
				for (num = 1; num <= 4; num++)
				{
					if (password == 1)
					{
						System.out.println("Input password at 1 no correct\n");
						break;
					} else if (password == 2)
					{
						System.out.println("Input password at 2 no correct\n");
						break;
					} else if (password == 3)
					{
						System.out.println("Input password at 3 no correct\n");
						break;
					} else if (password == 4)
					{
						System.exit(0);
					}
				}
			}

		}

	}

}
