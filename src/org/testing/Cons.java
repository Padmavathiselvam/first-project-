package org.testing;          
public class Cons {

	public Cons() {                            // no parameter constructor ,no return type (void)
		System.out.println("hello world");
		}
	
	public Cons(float s) {                     // parametaraized constructor
		System.out.println(s);
		}
	
	
	

	public static void main(String[] args) {
		Cons eg=new Cons();
		Cons gb=new Cons(287);
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
