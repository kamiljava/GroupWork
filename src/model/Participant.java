package model;


public class Participant {

    private String studentFullName;

    @Override
    public String toString() {
        return String.format("| %20s |", studentFullName);
    }

    public Participant(String coursantFullName) {
        this.studentFullName = coursantFullName;
    }

    public String getCoursantFullName() {
        return studentFullName;
    }

    public void setCoursantFullName(String coursantFullName) {
        this.studentFullName = coursantFullName;
    }
}