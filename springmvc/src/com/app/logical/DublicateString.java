package com.app.logical;

public class DublicateString {

	public static void main(String[] args) {
		String st = "parthanjaya";
		char str[] = st.toCharArray();
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					if (temp.indexOf(st.charAt(i)) == -1) {
						temp = temp + st.charAt(i);
					}
					break;
				}

			}
		}
		System.out.println(temp);
	}

}
