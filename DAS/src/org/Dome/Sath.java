package org.Dome;

public class Sath implements Vasu ,Vinoth,Gowtha{

	
	public static void main(String[] args) {
		
		Sath  si= new Sath();
	
		si.simbhu();
		si.master();
		
		si.valimai();
		
		
		
	}

	@Override
	public void valimai() {
		System.out.println("Sath.valimai()");
		
	}

	@Override
	public void simbhu() {
	System.out.println("Sath.simbhu()");	
	}

	@Override
	public void master() {
System.out.println("Sath.master()");	
	}
}
