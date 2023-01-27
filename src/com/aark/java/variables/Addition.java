package com.aark.java.variables;

public class Addition {

	public Addition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addIntegers(10, 20));
		System.out.println(addIntegers(100, 20));
		System.out.println(substractIntegers(5, 10));
		System.out.println(multiplyIntegers(10, 50));
		System.out.println(addFloat((float)60.5, (float)0.5));
		System.out.println(addFloat((float)60, (float)0.5));
		System.out.println(addFloat((float)50, (float)0.5));
		
	}

	public static int addIntegers(int a, int b) {
		return a + b;
	}
    public static int substractIntegers(int a, int b) {
		return a - b;
	}
    public static int multiplyIntegers(int a, int b) {
		return a * b;
	}
    public static float addFloat (float a, float b) {
    	return a + b;
    }

}
