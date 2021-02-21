package demo;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws T=new Throws();
		try {
			T.m1();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occurede");
		}
		
		}

public void m1() throws Exception{
	
	int age=10;
	
	if(age<18) {
		throw new Exception("not valid");
	}
	else {
		System.out.println("welcome");
	}
}
}

