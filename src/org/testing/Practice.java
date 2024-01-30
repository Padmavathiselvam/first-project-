package org.testing;

public class Practice extends Method_Overriding{

	@Override
	public void john() {
		super.john();                        //parent class reference
	}

@Override
public void john(float a, float b, float c) {
	super.john(a, b, c);
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
	Practice k=new Practice();
	k.john();
	k.john(8, 4);
	k.john(1, 5, 5);
	k.john(9, 3, 2);
}

}
