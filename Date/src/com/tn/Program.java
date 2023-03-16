package com.tn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student{
    private  Date registered;

    public Student(Date registered) {
        this.registered = registered;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "Student{" +
                "registered=" + registered +
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        String strBirthday = "1998-12-31 06:15:21";
        Date date1 = null;
        try{
            date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strBirthday);
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.println("Str Birthday: "+strBirthday);
        System.out.println("Result: "+date1);

        Student st = new Student(date1);
        System.out.println(st);
    }
}
