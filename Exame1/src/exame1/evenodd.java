import java.util.Arrays;
import java.util.Collections;

public class evenodd
{

	public static int CountEven(int[] a, int Size)
	{
		int i, evenCount = 0;
		System.out.print("\nมีเลขคู่คือ ");
		for (i = 0; i < Size; i++)
		{
			if (a[i] % 2 == 0)
			{
				System.out.print(+a[i] + " ");
				evenCount++;
			}
		}
		return evenCount;
	}

	public static int CountOdd(int[] a, int Size)
	{
		int i, oddCount = 0;
		System.out.print("\nมีเลขคี่คือ ");
		for (i = 0; i < Size; i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.print(+a[i] + " ");
				oddCount++;
			}
		}
		return oddCount;
	}

	public static int evensum(int[] a, int Size)
	{

		System.out.print("ผลรวมของเลขคู่  ");
		int i, EvenSum = 0;
		for (i = 0; i < Size; i++)
		{
			if (a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i];
			}
		}
		System.out.print(EvenSum);
		return EvenSum;
	}

	public static int oddsum(int[] a, int Size)
	{

		System.out.print("\nผลรวมของเลขคี่  ");
		int i, OddSum = 0;
		for (i = 0; i < Size; i++)
		{
			if (a[i] % 2 != 0)
			{
				OddSum = OddSum + a[i];
			}
		}
		System.out.print(OddSum);
		return OddSum;
	}

	
	
	
}
