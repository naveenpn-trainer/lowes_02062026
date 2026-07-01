package m09_functional_programming_using_streams._03_optional_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee {
    private int id;
    private String name;
    private Manager manager;

    public Employee(int id, String name, Manager manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }
    public Optional<Manager> getManagerWrappedWithOptional() {
        return Optional.ofNullable(manager);
    }

}

class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class EmployeeMockDataGenerator {
    public static Optional<List<Employee>> getMockEmployeesWrappedInOptional(){
        Manager manager1 = new Manager("M1");
        Manager manager2 = new Manager("M2");

        Employee e1 = new Employee(1,"E1",manager1);
        Employee e2 = new Employee(1,"E2",manager2);
        Employee e3 = new Employee(1,"E3",manager2);
        Employee e4 = new Employee(1,"E4",null);

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        return Optional.of(employeesList);
    }

    public static List<Employee>getMockEmployees(){
        Manager manager1 = new Manager("M1");
        Manager manager2 = new Manager("M2");

        Employee e1 = new Employee(1,"E1",manager1);
        Employee e2 = new Employee(1,"E2",manager2);
        Employee e3 = new Employee(1,"E3",manager2);
        Employee e4 = new Employee(1,"E4",null);

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        return employeesList;
    }
}
