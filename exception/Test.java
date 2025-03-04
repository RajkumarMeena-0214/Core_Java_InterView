package com.exception;
public class Test {
    public static void main(String[] args) {
	    // ye class nhi bnani h pr 1 bar chla ke dekh lena retrun type kese override hora h 
        System.out.println(test());
    }

   
	public static int test() {

       
        String name = "Vijay"; 
        try {
            System.out.println(name.charAt(6));
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("-->" + e.getMessage());
            return 10;
        } catch (Exception e) {
            System.out.println("Cought by Parent" + e.getMessage());
            return 15;
        } finally {
            System.out.println("This is Finally");
            return 20;
        }
        //return 100;
    }

}
