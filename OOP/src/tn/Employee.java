package tn;

public class Employee extends Person{
    private int salary;

    @Override//ghi de
    public void showData(){
        System.out.println("Show thong tin in Employee");
        System.out.println("Full name: "+getFullName());
        System.out.println("Address: "+getAddress());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
