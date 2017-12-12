package com.roman;
import java.util.Arrays;
class ArrayListDemo<E>  {

    private int index ;
    private int defaultsize = 10;
    private Object[] elements = new Object[defaultsize];
    private int size;

    ArrayListDemo(){

        elements = (E[]) new Object[defaultsize];
    }

    public int size(){

        return size;
    }

    public boolean add(Object value) {
        if (index == elements.length) {
                Object[] newArray = new Object[elements.length + 1];
                System.arraycopy(elements, 0, newArray, 0, index);
                elements = newArray;
            }
            elements[index++] = value;
            size++;
           return true;
    }
    public void add(int index, Object value ){
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;

    }


    public boolean remove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;

        if (elements[index] == null){

        }
        return true;
    }


    public String toString(){
        return  Arrays.toString( elements);
    }

    public static void main(String[] args) {
       ArrayListDemo<Integer> a1 = new ArrayListDemo<>();
       for(int i = 0; i<17;i++){
            a1.add(i);
          }
        System.out.println(a1 );
        System.out.println(a1.add(2));
        System.out.println(a1 );
        System.out.println(a1.remove(1));
        for(int i = 0; i<13;i++){
            a1.remove(i);
        }
        System.out.println(a1);
        a1.add(1, "F");
        System.out.println(a1 );
    }
}
