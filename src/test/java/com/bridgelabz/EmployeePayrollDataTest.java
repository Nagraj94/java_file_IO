package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollDataTest {

    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData employeePayrollData1 = new EmployeePayrollData(1,"Nagraj",26000);
        EmployeePayrollData employeePayrollData2 = new EmployeePayrollData(2,"Sachin",32000);
        EmployeePayrollData employeePayrollData3 = new EmployeePayrollData(3,"Ajay",43000);

        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(employeePayrollData1);
        employeePayrollDataList.add(employeePayrollData2);
        employeePayrollDataList.add(employeePayrollData3);

        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
    }
}
