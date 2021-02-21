package demo;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit type casting");
		
		char a='A';
		System.out.println("value of a:"+a);
		
		int b=a;
		System.out.println("value of b:"+b);
		
		//explicit conversion
		System.out.println("Explicit type casting");
		double x=45.5;
		System.out.println("value of x:"+x);
		
		int y= (int)x;
		System.out.println("value of y:"+y);

	}

}
