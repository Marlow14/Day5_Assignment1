package com.week1.day5.assignment1;

public class TestMethodsAndFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsAndFlow maf = new MethodsAndFlow(args);
		
		maf.outputAll();
		System.out.println("\n");
		maf.outputSubset(1, 8);
		maf.outputSubset(-200, 4000);
		maf.outputSubset(-4000, 200);
	}

}
