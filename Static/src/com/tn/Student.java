package com.tn;

public class Student {
    private String fullName;
    private int age;
    private static String schoolName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", schoolName=" + Student.getSchoolName() +
                '}';
    }
    public Integer getChuVi(Integer width, Integer height){
        if (width == null || height == null){
            return null;
        }
        return (width+height)*2;
    }
}
