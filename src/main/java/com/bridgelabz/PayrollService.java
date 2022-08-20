package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface PayrollService {

    boolean writePayrollData(List<EmployeePayrollData> employeePayrollDataList) throws IOException;
    void readPayrollData() throws IOException;
    long countEntries() throws IOException;

}
