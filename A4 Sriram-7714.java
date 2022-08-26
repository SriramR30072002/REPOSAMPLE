package Sripackage;

import java.util.Scanner;

public class Activity3 {
	int x, y, z ;
	
	Scanner sc = new Scanner(System.in);
	public void myMethod0() {
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		System.out.println("The Value of X is : "+x);
		System.out.println("The Value of Y is : "+y);
		System.out.println("The Value of Z is : "+z);
		
	}
	
public void myMethod1() {
	
	int a ;
	a= sc.nextInt();
	System.out.println("The Value of A is " +a);
		
	}
	
	public void myMethod2() {
		
		int b ;
		b= sc.nextInt();
		System.out.println("The Value of B is " +b);
	}

	public void myMethod3() {
		
		int c ;
		c= sc.nextInt();
		System.out.println("The Value of C is " +c);
	}

	
	public static void main(String[] args) {
		
		Activity3 s = new Activity3();
		s.myMethod0();
		s.myMethod1();
		s.myMethod2();
		s.myMethod3();
		
		System.out.println("The Output is verified Successfully");
		
//		sc.close();

	}

}
