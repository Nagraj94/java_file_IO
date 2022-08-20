package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public class EmployeePayrollService {

    public enum IOService{
        CONSOLE_IO, FILE_IO;
    }
    private final List<EmployeePayrollData> employeePayrollDataList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    public boolean writeEmployeePayrollData(IOService ioService){
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        try {
            return payrollService.writePayrollData(employeePayrollDataList);
        }catch (IOException ie){
            System.out.println("catch block");
        }
        return false;
    }
    public void readEmployeePayrollData(IOService ioService){
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        try {
            payrollService.readPayrollData();
        }catch (IOException ie){
            System.out.println("catch block");
        }
    }

    public long countEntries(IOService ioService) {
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        try {
            return payrollService.countEntries();
        }catch (IOException ie){
            System.out.println("catch block");
        }
        return 0;
    }

    private PayrollService getEmployeePayrollObject(IOService ioType) {
        PayrollService payrollService = null;
        if (IOService.FILE_IO.equals(ioType)){
            payrollService = new FileIOServiceImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            payrollService = new ConsoleIOServiceImpl();
        }
        return payrollService;
    }
}
