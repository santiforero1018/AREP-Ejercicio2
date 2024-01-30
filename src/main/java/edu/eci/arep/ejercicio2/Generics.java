package edu.eci.arep.ejercicio2;

import java.util.*;

public class Generics {

    public static void main(String[] args) {
        List<Integer> intList = new MyLinkedList<Integer>();
        intList.add(0);
        Integer x = intList.iterator().next();

        String[] arrayStr = {"2","chimba"};
        List<String> listStr = new MyLinkedList<String>();

        fromArrayToCollection(arrayStr, listStr);
        printCollection(listStr);
    }

    // static void printCollection(Collection c) {
    //     Iterator i = c.iterator();
    //     for (k = 0; k < c.size(); k++) {
    //         System.out.println(i.next());
    //     }
    // }

    static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
        c.add(o); // compile-time error
        }
       }

}
