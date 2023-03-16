package com.TinhDongGoi;

public class Student {
    //private chi goi dc id trong rieng "class Student",ko the goi dc o cac "class" ngoai
    public int id;
    //public goi duoc o tat ca cac "class"
    public String username;
    private String fullName;
    public String address;
    //Default la mac dinh ko can ghi
    int age;

    public void showData(){
        id = 10;
        System.out.println(id);
    }
    private void showData2(){
        id = 10;
        System.out.println(id);
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
