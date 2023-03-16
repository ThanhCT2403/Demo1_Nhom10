package tn;

public class Program {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setFullName("Ngoc");
        employee.setAddress("17 Ta Quang buu");
        employee.showData();

        Manager manager =  new Manager();
        manager.setSalaryResponsibility(100);

        CommonNumber commonNumber = new CommonNumber();
        int result1 = commonNumber.sum(2,3);
        System.out.println("Result 1: "+result1);

        int result2 = commonNumber.sum(2,"Ngoc");
        System.out.println("Result 2: "+result2);

    }
}
