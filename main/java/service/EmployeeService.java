
package service;

import org.springframework.model.Employee;
import org.springframework.stereotype.Service;

@Service
class EmployeeService {
    private static final int SIZE = 3;
    private final Employee[] employees =  new Employee[SIZE];

    public Employee add(String firstName , String lastName) {
        for (int i =0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees [i] = new Employee(firstName, lastName);
                return employees[i];

            }
        }
    }
}
