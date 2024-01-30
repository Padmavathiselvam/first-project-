package org.testing;

public class Variable {

      float k=349;	
      int jack =10;
	 long john=90;
	 char amely='k';         // class variable
	 
	static String hari="static variable"; // static variable
	
	
	public static void main(String[] args) {
		
		long jk=80;
		char rose='j';    //local variable
		String kalai="ackiechan";
		
		System.out.println(rose+kalai+","+jk );
		
		
		Variable k=new Variable();
		System.out.println(k.jack);
		System.out.println(k.john);
		System.out.println(k.amely);
		System.out.println(k.k);
		
		System.out.println(hari);
		
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

