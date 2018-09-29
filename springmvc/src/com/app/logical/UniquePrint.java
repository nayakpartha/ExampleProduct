package com.app.logical;

public class UniquePrint {

	public static void main(String[] args) {
		String str = "azaffbbcdee";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (temp.indexOf(str.charAt(i)) == -1) {
				temp = temp + str.charAt(i);
			} else {
				temp = temp.replace(String.valueOf(str.charAt(i)), "");
			}
		}
		System.out.println(temp);
		
	}

}
