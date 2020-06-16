package service.impl;

import commons.EmployeeCSV;
import models.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private static Map<String,Employee> employeeMap;

    static {
        employeeMap = new HashMap<>();
        employeeMap.put("001", new Employee("001", "Nguyen Hong Aon", 20, "Da Nang"));
        employeeMap.put("003", new Employee("003", "Nguyen Hong Don", 20, "Da Nang"));
        employeeMap.put("004", new Employee("004", "Nguyen Vong Son", 20, "Da Nang"));
        employeeMap.put("005", new Employee("005", "Nguyen Long Son", 20, "Da Nang"));
        employeeMap.put("006", new Employee("006", "Nguyen Hong Bon", 20, "Da Nang"));
        employeeMap.put("007", new Employee("007", "Nguyen Cong Don", 20, "Da Nang"));
        employeeMap.put("008", new Employee("008", "Nguyen Hong Son", 20, "Da Nang"));
        employeeMap.put("009", new Employee("009", "Nguyen Hong Son", 20, "Da Nang"));
        employeeMap.put("010", new Employee("010", "Nguyen Hong Son", 20, "Da Nang"));
    }

    @Override
    public List<Employee> getAllListEmployee(){
        ArrayList<Employee> employeeList = new ArrayList<>(employeeMap.values());
        EmployeeCSV.writeFileEmployeeCSV(employeeList);
            return employeeList;
    }
}
