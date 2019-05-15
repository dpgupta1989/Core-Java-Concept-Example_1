package com.java.typecasting;

public class ObjectCastingExampleMainProgram {
	
	public static void main(String[] args){
		
		Car obj = new Ford();
		
//	    Following will result in compilation error
//			    obj.fordMethod();	//As the method fordMethod is undefined for the Car Type
			//  Following will result in compilation error
			// ((HeavyVehicle)obj).fordMethod();
						//fordMethod is undefined in the HeavyVehicle Type
			//  Following will result in compilation error
		((Ford) obj).fordMethod();
			//Following will compile and run
			//	Honda hondaObj = (Ford)obj;	Cannot convert as they are sibblings
	
		Car c1 = new Car();
		Car c2 = new Ford(); //Upcasting
		Ford f1 = new Ford();
		Car c3 = new Honda();
		Honda h1 = (Honda) new Car(); //Downcasting
		
	}
}
