

package com.exception;

public class NumberFormatExce {
	
    public static void main(String[] args) {
	        String s="lokesh123";
	        try {
	        	
	            int i=Integer.parseInt(s);
	           
	        }catch (NumberFormatException e){
	            System.out.println(e);
	        }
	    }
	}
