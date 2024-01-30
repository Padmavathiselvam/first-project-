package org.testing;

public class Method_Overriding extends Method_Overloading {    

@Override
public void john() {
	super.john();
}

@Override
	public void john(int a, int b) {
		super.john(a, b);
	}

@Override
	public void john(long l, long h, long k) {
		super.john(l, h, k);
	}

public static void main(String[] args) {
	Method_Overriding jn=new Method_Overriding();
	jn.john();
	jn.john(9, 4);
	jn.john(2, 6, 9);
}



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

