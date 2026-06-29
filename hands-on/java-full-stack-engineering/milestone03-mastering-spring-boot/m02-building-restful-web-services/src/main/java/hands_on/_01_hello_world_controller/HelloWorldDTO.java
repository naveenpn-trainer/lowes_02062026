package hands_on._01_hello_world_controller;

import java.time.LocalDate;

public class HelloWorldDTO {
    private String name;
    LocalDate currentDate = LocalDate.now();

    public HelloWorldDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
}
