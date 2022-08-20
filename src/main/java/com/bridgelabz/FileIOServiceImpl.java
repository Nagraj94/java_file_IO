package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOServiceImpl implements PayrollService{

    private final String FILE_PATH = "C:\\Users\\admin\\IdeaProjects\\java_file_IO\\src\\main\\java\\com\\bridgelabz\\EmployeeDataEntry.txt";
    @Override
    public boolean writePayrollData(List<EmployeePayrollData> employeePayrollDataList) throws IOException {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollDataList.forEach(empData -> {
            String empDataString = empData.toString().concat("\n");
            empBuffer.append(empDataString);
        });
        Path path = Files.write(Paths.get(FILE_PATH),empBuffer.toString().getBytes());
        return path != null ? true : false;
    }

    @Override
    public void readPayrollData() throws IOException {
        Files.lines(new File(FILE_PATH).toPath()).forEach(empData -> System.out.println(empData));

    }

    @Override
    public long countEntries() throws IOException {
        return Files.lines(new File(FILE_PATH).toPath()).count();
    }
}
