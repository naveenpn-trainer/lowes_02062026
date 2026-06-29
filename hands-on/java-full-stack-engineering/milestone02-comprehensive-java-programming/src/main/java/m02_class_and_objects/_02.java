package m02_class_and_objects;
class Employee {
    String name;
    int id;
    double salary;
    String department;
    static String company;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        Employee.company = "Lowes";
    }

    Employee(int id, String name, double salary, String department){
        this(name,id, salary);
        this.department =department;

    }

    Employee(Employee emp, String name, int id){
        this.name = name;
        this.id = id;
        this.department = emp.department;
    }
    void printDetails(){
        System.out.println(id+""+name+""+salary+""+department+""+Employee.company);
    }



}
public class _02 {
    public static void main(String[] args) {
        Employee employee =new Employee("Naveen",1,1000);
        employee.printDetails();

        Employee mounika =new Employee(1,"Mounika",3000,"R&D");
        mounika.printDetails();

        Employee ananya =new Employee(mounika,"Ananya",2);
        mounika.printDetails();
    }
}
