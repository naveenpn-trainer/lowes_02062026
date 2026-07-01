package m09_functional_programming_using_streams._03_optional_new;

import java.util.List;
import java.util.Optional;

public class _05 {
    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeMockDataGenerator.getMockEmployees();

        //  Traditional Approach
        for (Employee employee : employeeList) {
            Manager manager = employee.getManager();
            String managerName = employee.getManager() != null ? employee.getManager().getName() : "'None'";
            System.out.println(employee.getName() + " reports to " + managerName);
        }

        //  Avoid using for Loop use forEach
        employeeList.forEach(emp -> {
            String managerName = emp.getManager() != null ? emp.getManager().getName() : "'None'";
            System.out.println(emp.getName() + " reports to " + managerName);
        });

        //  forEach + Optional
        employeeList.forEach(emp -> {
            Optional<Manager> managerWrappedInOptional = Optional.ofNullable(emp.getManager());
            String managerName = managerWrappedInOptional.map(mgr-> mgr.getName()).orElse("'None'");
            System.out.println(emp.getName() + " reports to " + managerName);
        });


        Optional<List<Employee>> employeeListWrappedInOptional = EmployeeMockDataGenerator.getMockEmployeesWrappedInOptional();

        //   Deprecated Warning
        employeeListWrappedInOptional.stream().forEach(eL -> {
            eL.forEach(e -> {
                String managerNameNew = Optional.ofNullable(e.getManager()).map(m -> m.getName()).orElse("'None'");
                System.out.println(e.getName() + " reports to " + managerNameNew);
            });
        });

        // Recommended
        employeeListWrappedInOptional.ifPresent(eL -> {
            eL.forEach(e -> {
                Optional<Manager> manager = Optional.ofNullable(e.getManager());
                String managerNameNew = manager.map(m -> m.getName()).orElse("'None'");
                System.out.println(e.getName() + " reports to " + managerNameNew);
            });
        });


    }
}
