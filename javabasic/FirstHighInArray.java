package com.javabasic;

public class FirstHighInArray {

	public static void main(String[] args) {
		int [] arr = {1,15,31,43,5,65,7,8};
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
	}
}
