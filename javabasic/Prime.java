package com.javabasic;

public class Prime {
public static void main(String[] args) {
	int num=17;
	boolean flag = true;
	for (int i = 2; i < num-1; i++) {
		if(num%i==0) {
		flag=false;	
	  }
	}
	if(flag) {
		System.out.println("primeNo");
	}
	else {
		System.out.println("no");
	}
  }
}
