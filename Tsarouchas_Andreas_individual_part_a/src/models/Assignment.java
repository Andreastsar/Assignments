package models;

import java.time.LocalDate;

public class Assignment {
    private String title;
    private String description;
    private LocalDate subDateTime;
    private float oralMark;
    private float totalMark;

    public Assignment() {
        title = "Assignment 1";
        description = "FullTime";

    }
}
