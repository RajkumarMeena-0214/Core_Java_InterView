package com.javabasic;


/**
 * @author lokesh solanki
 *
 */
public class MethodCalling {

	public static  int doStuff(int [] a , int b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				return i;
			}
		}
		return -1;
}
	public static void main(String[] args) {
		int [] a = {1,4,3,5};
		int b =3;
	int c =	doStuff(a,b);
	System.out.println(c);
	}

}
