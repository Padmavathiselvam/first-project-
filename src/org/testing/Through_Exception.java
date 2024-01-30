package org.testing;


public class Through_Exception  {
	
 private void vote(int a) throws NumberFormatException,StringIndexOutOfBoundsException{
if (a==1) {
	throw new NumberFormatException("not eligible");
	
} else {
throw new StringIndexOutOfBoundsException("eligible");
}
}
public static void main(String[] args) throws Exception {
	Through_Exception n=new Through_Exception();
	
	
	//n.vote(9);
//	try {
//		n.vote(1);
//	} catch (Exception e) {
//		System.out.println(e);
//	}
}



	}





