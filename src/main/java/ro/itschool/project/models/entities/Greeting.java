package ro.itschool.project.models.entities;

import lombok.Data;

@Data
public class Greeting {
    private String name;
    private String description;

    @Override
    public String toString() {
        return description + ", " + name;
    }
}
