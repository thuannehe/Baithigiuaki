import java.util.ArrayList;
import java.util.List;

public class EmployeeManage {
    private List<Employee> employees;

    public EmployeeManage() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.EmployeeC++;
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.EmployeeC--;
    }

    public Employee findEmployeeID(String ID) {
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
