package com.tn;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    @Test
    public void getFullNameTest(){
        String result = new Person().getFullName(null,"Ngoc");
        Assertions.assertNull(result);
    }
    @Test
    public void getFullNameTest1(){
        String result = new Person().getFullName("Nguyen","Ngoc");
        Assertions.assertNotNull(result);
    }
}
