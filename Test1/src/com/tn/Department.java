package com.tn;

public class Department {
    public int id;
    public String departmentName;
    public String responsive;

    public Department(int id, String departmentName, String responsive) {
        this.id = id;
        this.departmentName = departmentName;
        this.responsive = responsive;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", responsive='" + responsive + '\'' +
                '}';
    }
}
