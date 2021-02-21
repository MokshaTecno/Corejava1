package demo;

public class Throw {

	public static void main(String[] args) {
		
		try {
		
		int age=10;
		if(age<18) {
			throw new ArithmeticException("not valid");
		}
		else {
			System.out.println("welcome");
		}
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		// TODO Auto-generated method stub

	}

}