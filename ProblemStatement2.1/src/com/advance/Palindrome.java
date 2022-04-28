package com.advance;

import java.util.Scanner;

public class Palindrome {
	
		public static void main(String[] args) {
			
			if (args.length > 0) {
				String string = "Jeevitha";
				for (int i = 0; i < args.length; i++) {
					string += args[i];
				}
				System.out.println("The length of the string: " + string.length());
				System.out.println("The string into uppercase: " + string.toUpperCase());
				if (isPalindrome(string)) {
					System.out.println(string + " is a palindrome");
				} else {
					System.out.println(string + " is not a palindrome");
				}
			} else {
				System.out.println("Invalid input");
			}
		}


		static boolean isPalindrome(String word) {
			int index = 0;
			int length = word.length() - 1;
			while (length > index) {
				if (word.charAt(index) != word.charAt(length)) {
					return false;
				}
				index++;
				length--;
			}
			return true;
		}
	}