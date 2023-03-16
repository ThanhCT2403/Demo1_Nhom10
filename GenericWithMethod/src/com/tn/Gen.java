package com.tn;

public class Gen {
    public <Obj> void Showdata(Obj obj){
        System.out.println("Value of obj: "+obj);
        System.out.println("Type: "+obj.getClass().getName());
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
