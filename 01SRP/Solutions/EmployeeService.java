package SRP.Solutions;

import SRP.Problems.Employee;

public class EmployeeService {

    // This class has achieved S.R.P

    public void employeeRegistration(Employee employee) {
        // registering an employee
        EmailService.send(employee.getEmail(), "Registration", "Congratulations!");
    }
}
