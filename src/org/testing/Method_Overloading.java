package org.testing;

public class Method_Overloading {

	public void john() {
		System.out.println("sum");

	}
	 
	public void john(int a,int b) {               // method name are same ,argument and parameter are differ
		System.out.println(a+b);
	}
	
		public void john(float a,float b,float c) {
			System.out.println(a+b+c);
	
		}
		public void john(long l,long h,long k) {
			System.out.println(l+h+k);
		}
		
		public static void main(String[] args) {
			Method_Overloading en=new Method_Overloading();       // this is object
			en.john();
			en.john(2, 6);
			en.john(8, 8, 4);
			en.john(9,9,2);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
