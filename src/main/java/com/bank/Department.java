package com.bank;

public class Department {
    private int departmentId;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
