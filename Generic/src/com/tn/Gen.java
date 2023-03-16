package com.tn;

import java.util.ArrayList;
import java.util.List;

public class Gen<T> {
    private T  obj;
    public Gen(T obj){
        this.obj = obj;
    }
    public void showData(){
        System.out.println("Value of object "+obj);

        //show type of object
        System.out.println(obj.getClass().getSimpleName());

        if (obj instanceof Person){
            System.out.println("Obj is an instance of Person");
            Integer id =((Person) obj).getId();
            id++;
            String username = ((Person) obj).getUsername();
            String password = ((Person) obj).getPassword();
            System.out.println("id "+id);
            System.out.println("username "+username);
            System.out.println("password "+password);
        }
        else {
            System.out.println("Not Person");
        }

        if (obj instanceof ArrayList){
            System.out.println("this is Arraylist");
            Person p1 = ((ArrayList<Person>) obj).get(1);
            System.out.println(p1.getUsername());
        }
        else {
            System.out.println("Not ArrayList");
        }
    }

}
//    class Gen2 {
//    private Double obj;
//    public Gen2(Double obj){
//        this.obj = obj;
//    }
//    public void showData(){
//        System.out.println("Value of object "+obj);
//    }
//
//}
