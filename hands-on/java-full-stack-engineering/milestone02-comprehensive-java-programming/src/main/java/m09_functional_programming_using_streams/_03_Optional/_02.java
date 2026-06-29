package m09_functional_programming_using_streams._03_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee {
    String name;
    Manager manager;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public Optional<Manager> getManagerWithOptional() {
        return Optional.ofNullable(this.manager);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

public class _02 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Manager m1 = new Manager("M1");
        Manager m2 = new Manager("M2");

        employeeList.add(new Employee("A", m1));
        employeeList.add(new Employee("B", m1));
        employeeList.add(new Employee("C", m2));
        employeeList.add(new Employee("D", null));

        for (Employee employee : employeeList) {
//            if(employee.getManager()!=null) {
//            System.out.println(employee.getName() + " reports to " + employee.getManager().getName());
//            }else{
//                System.out.println(employee.getName() + " reports to " +"No one");
//            }
        }

        /*employeeList.stream().forEach(
                e -> System.out.println(e.getName() + " reports to " + e.getManager().getName())
        );*/

       /* employeeList.stream().forEach(e -> {
            Optional<Manager> manager = Optional.ofNullable(e.getManager());
            manager.ifPresentOrElse(m -> {
                        e.getName() + "report to " + e.getManager().getName())
                    }, () -> {
                        System.out.println(e.getName() + " reports to No Manager");
                    }
            );
*/
         /*   String managerName = manager
                    .map(m -> m.getName())
                    .orElse("No Manager");
            System.out.println(e.getName() + " reports to " + managerName);

        });*/

/*
        employeeList.stream()
                .map(employee -> {
                    String managerName = Optional.ofNullable(employee.getManager())
                            .map(e->e.getName())
                            .orElse("No Manager");

                    return employee.getName() + " reports to " + managerName;
                })
                .forEach(System.out::println);
                */
    }
}
