package com.java.datatypes;

public class JavaDataTypesMainProgram {

	public static void main(String[] args) {
		
		System.out.println("Inside JavaDataTypesMainProgram ");
		
		int a=10;
		int b=10;
		int c=a+b;
		float f=a;
		System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		
		System.out.println("Example of typecasting");
		float f1=10.5f;
//		int a1=f1; 			//Compilation error  
		int a1=(int) f1;	//Type casting
		System.out.println(f1);
		System.out.println(a1);
		
		boolean b1 = true; 
		if(b1==true){
		System.out.println("Boolean is set to true");
		}
		
		System.out.println("byte can hold values from -128 to 127");
		byte s = 126;
		 
        // byte is 8 bit value
        System.out.println(s);
        
        s++;
        System.out.println(s);
         
        // It overflows here because
        // byte can hold values from -128 to 127
        s++;
        System.out.println(s);
         
        // Looping back within the range
        s++;
        System.out.println(s);
	}
}
