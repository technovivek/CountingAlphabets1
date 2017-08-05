package com.practice;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class CountingAlphabets1 {

	public static void main(String[] args) {

		String myStr = "QQQQWWWWWEEEEEWWWWWRRRRRRRYYYYYSSSSSESSESSSESS";
		//System.out.println(myStr.length());
		int count = 1, j = 0;
		;
		char t = 0;
		for (int i = 0; i < myStr.length(); i++) {

			j = i + 1;// if i is 12 then j is 13

			if (j < myStr.length()) {
				t = myStr.charAt(j);

				if (myStr.charAt(i) == t) {
					++count;
					// i++;

				}

				else {
					System.out.print(myStr.charAt(i) + "" + count);
					count = 1;

				}
			}
			else if(j==myStr.length())
			{
				System.out.print(myStr.charAt(i) + "" + count);
			}

		}

	}
}
