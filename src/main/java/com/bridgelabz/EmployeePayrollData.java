package com.bridgelabz;

public class EmployeePayrollData {
    private int empId;
    private String empName;
    private int salary;

    public EmployeePayrollData(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

