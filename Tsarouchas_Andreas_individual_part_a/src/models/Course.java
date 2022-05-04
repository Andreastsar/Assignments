package models;

import java.time.LocalDate;

public class Course {
    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;

    public Course() {
        title = "Course 1";
        stream = "Java";
        type = "FullTime";
        start_date = LocalDate.of(2022,2,14);
        end_date = LocalDate.of(2022,5,16);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("title='").append(title).append('\'');
        sb.append(", stream='").append(stream).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", start_date=").append(start_date);
        sb.append(", end_date=").append(end_date);
        sb.append('}');
        return sb.toString();
    }
}
