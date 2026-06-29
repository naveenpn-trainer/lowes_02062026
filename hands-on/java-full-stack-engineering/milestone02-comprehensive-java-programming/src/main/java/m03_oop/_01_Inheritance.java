package m03_oop;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name= " + this.name + " Age= " + this.age);
    }
}

class Employee extends Person {
    String companyName;
    int salary;

    public Employee(String name, int age, String companyName, int salary) {
        super(name, age);
        this.companyName = companyName;
        this.salary = salary;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Company Name= " + this.companyName + " Salary= " + this.salary);
    }
}

class Manager extends Employee {
    String teamName;

    public Manager(String name, int age, String companyName, int salary, String teamName) {
        super(name, age, companyName, salary);
        this.teamName = teamName;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Name= " + this.teamName);
    }
}
class SalaryHikeUtil{
    public static void incrementHike(Employee employee){
       if (employee instanceof Manager){
           employee.salary = employee.salary * 10;
       } else if (employee instanceof  Employee) {
           employee.salary = employee.salary * 2;
       }else{
           System.out.println("Not eligible for salary hike");
       }
    }
}
public class _01_Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Dingdong",24,"Sleep Well",10000);
        Manager m1 = new Manager("Dingdong",24,"Sleep Well",10000,"Dancing");

        SalaryHikeUtil.incrementHike(m1);
    }

}
