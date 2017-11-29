package com.roman;



class MyException extends Exception{
    private String detail;
    MyException(String a){
        detail = a;
    }
    public String toString(){
        return "MyException{"+detail+"]";
    }
}

public class Main {
    static void demo(String s, String s1 ) throws MyException{
        if(s.equals(s1))throw new MyException(s);
        System.out.println("normal exit");
    }
    public static void main(String[] args) {
        try{
            demo("hello", "helo");
            demo("hello", "hello");
        }catch(MyException e){
            System.out.println("caught " + e);
        }
        finally {
            System.out.println("end of demo");
        }
    }

}