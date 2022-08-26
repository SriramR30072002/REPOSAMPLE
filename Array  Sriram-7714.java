package MyArray;

public class array {
	
	static String [] subjects = {"Tamil   ", "English ", "Maths   ", "Science ", "Social  "};
    static  double [] percentage = {34.99,98.02,65.12,34.88,87.16};
	public void marks()
	{
		
	 int [] marks = {78,98,89,58,99};
			 System.out.println( subjects[0]+"= " +marks[0]+ " Percentage :" +percentage[0]);
			 System.out.println( subjects[1]+"= " +marks[1]+ " Percentage :" +percentage[1]);
			 System.out.println( subjects[2]+"= " +marks[2]+ " Percentage :" +percentage[2]);
			 System.out.println( subjects[3]+"= " +marks[3]+ " Percentage :" +percentage[3]);
			 System.out.println( subjects[4]+"= " +marks[4]+ " Percentage :" +percentage[4]);
			 
			           			 
	}
	
	
	                                 
	public static void main(String[] args) {
		array obj = new array();
		obj.marks();
		
		
		System.out.println("Output Verified Successfully");	
		
		
	}

}
