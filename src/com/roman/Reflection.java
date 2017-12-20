package com.roman;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

class Reflection {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Class example = Class.forName("java.util.HashMap");
        HashMap c = (HashMap) example.newInstance();
        c.put("S",1);
        c.put("T",2);
        c.put("W",3);
        System.out.println(c);
        System.out.println(c.getClass());
        System.out.println(c.getClass().getSuperclass());
@Change(change = 1,author = "Roman",time = "12:20")
        Class[] interfaces = example.getInterfaces();
        for(Class cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }
        @Change(change = 2,author = "Roman",time = "12-30")
        Class arr = ArrayList.class;
        Class[] interfaces1 = arr.getInterfaces();
        for(Class cInterface : interfaces1) {
            System.out.println(cInterface.getName());
        }
        @DefaultChange
        Field [] fields = arr.getDeclaredFields();
        for(Field field : fields){
            Class fieldType = field.getType();
            System.out.println("Name: "+field.getName());
            System.out.println("Type: "+fieldType.getName());
        }

        Class e =Class.forName("com.roman.Change");
        Class[] inter = e.getInterfaces();
        for(Class cInterface : inter) {
            System.out.println( cInterface.getName() );
        }

    }
}
