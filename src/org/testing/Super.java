package org.testing;

public class Super  extends Method_Overloading{
@Override
	public void john(int a, int b) {
		super.john(a, b);   // parent class reference
	}
@Override
	public void john() {
		super.john();}         // parent class reference
@Override
	public void john(float a, float b, float c) {
		super.john(a, b, c);
}

@Override
	public void john(long l, long h, long k) {
		super.john(l, h, k);
	}
	public static void main(String[] args) {
		
		Super l=new Super();
		l.john();
		l.john(2, 90);
		l.john(30, 30,30);
		l.john(8, 1, 1);
	}
	
	
	
	
	
	
	
	
	
}
