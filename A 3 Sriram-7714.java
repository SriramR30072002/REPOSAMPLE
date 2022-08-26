package Sripackage;

public class Activity3 {

public void myMethod1() {
		
		System.out.println("This is method 1");
		
	}
	
	public void myMethod2() {
		System.out.println("This is Method 2");
	}

	public void myMethod3() {
		System.out.println("This is Method 3");
	}

	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		Activity3 s = new Activity3();
		s.myMethod3();
		s.myMethod2();

	}

}
