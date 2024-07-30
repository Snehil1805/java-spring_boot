package hashMap1;

import java.util.*;

public class EmployeeManagement {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManagement() {
        employeeMap = new HashMap<>();//Write a missing code here
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeID(),employee); //Write a missing code here
    }
    
    public Employee getEmployee(int employeeID) {
        return employeeMap.get(employeeID);//Write a missing code here
    }

    public List<Employee> getAllEmployeesSortedByName() {
        List <Employee> employee = new ArrayList<>(employeeMap.values());
        Collections.sort(employee);
        return employee; //Write a missing code here
    }

    public boolean removeEmployee(int employeeID) {
        return employeeMap.remove(employeeID) != null; //Write a missing code here
    }
}