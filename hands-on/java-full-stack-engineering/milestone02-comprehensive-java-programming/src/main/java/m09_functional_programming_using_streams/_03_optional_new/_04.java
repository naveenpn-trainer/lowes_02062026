package m09_functional_programming_using_streams._03_optional_new;

import java.util.Optional;

public class _04 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("M1");
        Employee e1 = new Employee(1, "E1", manager1);


        String managerName = null;
        if (e1.getManager() != null) {
            managerName = e1.getManager().getName();
        } else {
            managerName = "'None'";
        }
        System.out.println(e1.getName() + " reports to " + managerName);



        Optional<Employee> employeeOptional = Optional.of(e1);
        employeeOptional.ifPresent(e -> {
            Optional<Manager> manager = Optional.ofNullable(e.getManager());
            //  Doesn't return value
            manager.ifPresentOrElse(m -> {
                        System.out.println(e.getName() + "reports to " + m.getName());
                    },
                    () -> System.out.println(e.getName() + " reports to 'None'"));
        });

        employeeOptional.ifPresent(e -> {
            Optional<Manager> manager = Optional.ofNullable(e.getManager());
            //  Return's value
            String managerNameNew = manager.map(m -> m.getName()).orElse("'None'");
            System.out.println(e.getName() + " reports to " + managerNameNew);
        });

        employeeOptional.ifPresent(e -> {
            //  Return's value
            String managerNameNew = e.getManagerWrappedWithOptional().map(m -> m.getName()).orElse("'None'");
            System.out.println(e.getName() + " reports to " + managerNameNew);
        });
    }
}
