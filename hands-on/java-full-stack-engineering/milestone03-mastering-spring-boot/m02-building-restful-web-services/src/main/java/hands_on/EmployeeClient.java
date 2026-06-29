package hands_on;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class Employee{
   private String id;
   private String name;
}
public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee("1","Naveen");
    }
}
