package m09_functional_programming_using_streams._02_imerative_vs_declarative;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    Manager manager;
    Address address;

    public Employee(int id, String name, String department, Manager manager) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", manager=" + manager +
                '}';
    }
}
class Address{
    String stateName;
    String cityName;

    public Address(String stateName, String cityName) {
        this.stateName = stateName;
        this.cityName = cityName;
    }
}
class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class _02 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Shwetha");
        Manager manager2 = new Manager("Arundhuti");
        List<Employee> employeeList = List.of(new Employee(1, "Naveen", "R&D", manager1),
                new Employee(2, "Ananya", "Management", manager1),
                new Employee(3, "Mounika", "Chairperson", manager1),
                new Employee(4, "Sonali", "Product Architect", manager2),
                new Employee(5, "Jaysree", "Solution Architect", manager2),
                new Employee(6, "Jasna", "R&D", manager2),
                new Employee(7, "Geetha", "R&D", null)

        );

        Map<String, List<Employee>> deptEmployeeNames = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.department));




//            Map<String, List<String>> deptEmployeeNames = employeeList.stream()
//                .collect(Collectors.groupingBy(
//                        e -> e.department,
//                        Collectors.mapping(e -> e.name, Collectors.toList())
//                ));

        System.out.println(deptEmployeeNames);


    }
}
