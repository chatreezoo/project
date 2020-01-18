
public class main {

	public static void main(String[] args) {
		System.out.println("welcome to programming");
		
		Box1 box = new Box1();
		Box2 mul = new Box2();
		box.h =10.00;
		box.w = 5.00;
		box.d=3.00;
		System.out.println(box.volumn());
		System.out.println("triangle area "+box.triangle());
		
		mul.x=7;
		mul.multiply();

	}

}
