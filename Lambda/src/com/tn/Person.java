package com.tn;

public class Person {
    public Integer id;
    public String username;
    public Integer salary;

    public Person(Integer id, String username, Integer salary) {
        this.id = id;
        this.username = username;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", salary=" + salary +
                '}';
    }
}
