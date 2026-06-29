package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces;

import java.util.function.Predicate;

class Student {
    private String name;
    private String city;
    private int totalMarks;

    public Student(String name, String city, int totalMarks) {
        this.name = name;
        this.city = city;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}

public class _03_Predicate {

    public static void printNamesFromBengaluru(Student[] students) {
        for (Student student : students) {
            if ("Bengaluru".equals(student.getCity())) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printNamesFromBengaluruAndBasedOnMarks(Student[] students) {
        for (Student student : students) {
            if (("Mangalore".equals(student.getCity())) && (student.getTotalMarks() >= 90)) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printLuckyName(Student[] students) {
        for (Student student : students) {
            if ("S".equals(student.getName().startsWith("S"))) {
                System.out.println(student.getName());
            }
        }
    }

    public static void getNames(Predicate<Student> predicate, Student[] students) {
        for (Student student : students) {
            if (predicate.test(student)) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Naveen", "Bengaluru", 100),
                new Student("Nikshay", "Mangalore", 95),
                new Student("Shruthi", "Mysore", 85)
        };

        Predicate<Student> namesFromBengaluru = (e) -> e.getCity().equals("Bengaluru");
        getNames(namesFromBengaluru, students);

        Predicate<Student> marksPredicate = (e) -> e.getTotalMarks()>90;
        getNames(marksPredicate, students);

    }


}
