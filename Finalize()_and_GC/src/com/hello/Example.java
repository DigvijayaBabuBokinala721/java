package com.hello;

public class Example {

	private Example e;
	
	@Override
	protected void finalize(){
		System.out.println(this);
	}
	
	public void m(Example e){
		Example e2 = new Example();
		Example e3 = new Example();
		e2.e = e3;
		e3.e = e2;
		e.e = e2; //holding 2 objects
	}
	
	public static void main(String[] args) throws InterruptedException {
		Example e1 = new Example();
		e1.m(e1);
//		e1 = null; //if we make e1 as unreferenced then all 3 objects will collapse
		System.gc(); 
		Thread.sleep(2000);
	}

}
