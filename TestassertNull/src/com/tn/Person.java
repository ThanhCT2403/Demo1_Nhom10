package com.tn;


public class Person {
    public String getFullName(String firstName, String lastName){
        if (firstName ==null||lastName ==null||firstName.trim().equals("")||lastName.trim().equals("")){
            return null;
        }
        return firstName + " "+ lastName;
    }
}
