package org.testing;

public class Implements implements inter1,Inter2,Inter3 {

	@Override
	public void bus() {
		System.out.println("27 km");
		
	}

	@Override
	public void bike() {
		System.out.println("34 km");
		
	}

	@Override
	public void car() {
		System.out.println("39 km");
		
	}

	public static void main(String[] args) {
		Implements ef=new Implements();
		ef.bike();
		ef.bus();
		ef.car();
	}
	
	
}
