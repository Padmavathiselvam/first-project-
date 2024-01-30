package org.testing;

public class default_constructor {
int a=9;
float l=7890;
public static void main(String[] args) {
	default_constructor l=new default_constructor();
	System.out.println(l.a);       //it not have a method ,direct main methodcall pannauvom
	System.out.println(l.l);
}
}
