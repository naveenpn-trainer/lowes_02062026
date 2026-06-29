package m09_functional_programming_using_streams._03_Optional.b_with_objects;

public class Employee {
    private int id;
    private String name;
    private Manager manager;

    public Employee(int id, String name, Manager manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }
}
