
package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        Enumeration<Integer> e = v.elements();
       // v.add(5);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
