package com.app.logical;

public class LargestASCII {

	public static void main(String[] args) {
		String str = "parthanjaya";
		int largest = 0;
		for (int i = 0; i < str.length(); i++) {
			if (((int) str.charAt(i)) > largest) {
				largest=(int) str.charAt(i);
			}
		}
		System.out.println(largest);
	}

}
