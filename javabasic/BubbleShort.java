package com.javabasic;

/**
 * @author lokesh solanki
 * in this class sir say write the first and second iteration
 *
 */
public class BubbleShort {


	public static void main(String[] args) {
		int[] num = { 7, 9, 1, 0, 5, 11 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

			System.out.println(num[i]);
		}
	}

}