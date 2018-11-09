package com.hashcode;

public class chinese extends human {
  
	private int a =2;
	
	public int getB() {
		return a;
	}

	//@Override
	public int getA() {
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		human hu=new human();
		chinese ch=new chinese();
		chinese ch1=new chinese();
		chinese ch2=ch1;
		
		System.out.println(hu.hashCode());
		System.out.println(ch.hashCode());
		System.out.println(ch1.hashCode());
		System.out.println(ch2.hashCode());
		System.out.println(hu.getA());
		System.out.println(ch.getA());
		System.out.println(ch.getB());
		
		
		Integer a=new Integer(127);
		Integer b=Integer.valueOf(127);
		System.out.println(a == b);
		
		System.out.println(new Integer(128) == new Integer(128));
		System.out.println(new Integer(129) == 129);
		System.out.println(new Integer(127) == 127);
		
	}

}
