package tn;

public class Person {
    private String fullName;
    private String address;

    public void showData(){
        System.out.println("Show thong tin");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+address);
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
