import java.util.Scanner;

public class MainScan
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //คำสั่งรับค่าจากแป้นพิมพ์
		int base,height; //ประกาศตัวแปลเป็นชนิดจำนวนเต็ม
		double area; //ประกาศตัวแปลเป็นชนิดทศนิยม
		System.out.print("รับค่าฐาน : ");//แสดง"รับค่าฐาน : "
		base = sc.nextInt();//รับค่าฐานจากแป้นพิมพ
		System.out.print("รับค่าสูง :  ");//แสดง"รับค่าสูง : "
		height = sc.nextInt();//รับค่าสูงจากแป้นพิมพ์
		
		area = 0.5*base*height;//คำนวณ
		
		System.out.println("total : "+area);//แสดงผลลัพธจากบรรทัดที่ 18์
		
	}

}
