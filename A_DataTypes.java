package com.in;

public class A_DataTypes {

	public static void main(String[] args) {
		
		
		
	//	byte c = -129; // 
		byte b = -128;
		
		byte a = 50;
		
		byte d = 127;
	//	byte e = 128;    // -2^7 to 2^7-1
		
		short f = -32768; //[-32768, 32767] -2^15 to 2^15-1
		
		short g = 32767;
		
		int h = 0; //  -2^32 to 2^32-1 
		// -4,29,49,67,296 to 4,29,49,67,295
		
		long i = 0; // -2^62 to 2^62-1
		
		long myContNo = 7507192804L; // L after the number		
		
		System.out.println("value of b ="+b);
		System.out.println("value of d ="+d);
		System.out.println("value of myContNo ="+myContNo);
		
		double j = 12.23;
		double k = 12.23D;
		
		float m = 45.23F; 
		float n = 45.23f;
		
		char p = '\u0000';
		char q = '\u0050';
		
		System.out.println(q);
		

	}

}
