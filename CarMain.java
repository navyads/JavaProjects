package com.ab;

public class CarMain {

	public static void main(String[] args) {
		
		Car mrt=new Maruti();
		Car tata=new Tata();
		
		mrt.getEngineDetails();
		mrt.getModel();
		mrt.getVersion();
		
		tata.getEngineDetails();
		tata.getModel();
		tata.getVersion();
	}

}
