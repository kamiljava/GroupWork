package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Course {
    private String nameCourse, categoryCourse, trainerName;
    private int countStudent;
    private LocalDate dateCourse;

    private List<Participant> studentList = new ArrayList<>();

    public List<Participant> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        String pattern = "dd-MM-yyyy" ;
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern(pattern);
        String dateMyFormat = simpleDateFormat.format(dateCourse);

        return String.format("%20s | %20s | %15d | %15s | %15s |",
                nameCourse, categoryCourse, countStudent, studentList, dateMyFormat);
    }

    public Course(String nameCourse, String categoryCourse, List<Participant> studentList, LocalDate dateCourse) {
        this.nameCourse = nameCourse;
        this.categoryCourse = categoryCourse;
        this.studentList = studentList;
        this.dateCourse = dateCourse;
    }

    public Course(String nameCourse, String categoryCourse, LocalDate dateCourse) {
        this.nameCourse = nameCourse;
        this.categoryCourse = categoryCourse;
        this.dateCourse = dateCourse;
    }

    public Course(String nameCourse, String categoryCourse, int countStudent, List<Participant> studentList, LocalDate dateCourse, String trainerName) {
        this.nameCourse = nameCourse;
        this.categoryCourse = categoryCourse;
        this.countStudent = countStudent;
        this.studentList = studentList;
        this.dateCourse = dateCourse;
        this.trainerName = trainerName;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getCategoryCourse() {
        return categoryCourse;
    }

    public void setCategoryCourse(String categoryCourse) {
        this.categoryCourse = categoryCourse;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public LocalDate getDateCourse() {
        return dateCourse;
    }

    public void setDateCourse(LocalDate dateCourse) {
        this.dateCourse = dateCourse;
    }

    public void setStudentList(List<Participant> studentList) {
        this.studentList = studentList;
    }

    public void getStudentList(List<Participant> studentList) {
        this.studentList = studentList;
    }
}