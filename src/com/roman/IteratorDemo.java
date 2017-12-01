package com.roman;

import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;

import java.util.*;

class IteratorDemo {

    public static void main(String[] args) {
ArrayList <String> a1 = new ArrayList<String>();
a1.add("C");
a1.add("A");
a1.add("E");
a1.add("B");
a1.add("D");
a1.add("F");
System.out.print("Array a1: ");
Iterator<String> itr = a1.iterator();
while(itr.hasNext()){
    String element = itr.next();
    System.out.print(element + " ");
}
System.out.println();
ListIterator<String> litr = a1.listIterator();
while(litr.hasNext()){
    String element = litr.next();
    litr.set(element+ "+");
}
System.out.print("Changed list array a1: ");
itr = a1.iterator();
while(itr.hasNext()){
    String element = itr.next();
    System.out.print(element+" ");
}
System.out.print("\nChanged array in reverse order: ");
while(litr.hasPrevious()){
    String element = litr.previous();
    System.out.print(element+" ");
}
System.out.println();
    }
}
