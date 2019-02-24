package controller;

import model.Course;
import model.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseController {

    List<Course> courseName = new ArrayList<>();

    public void addCourse(String nameCourse, String categoryCourse, LocalDate dateCourse) {
        Course cn = new Course(nameCourse, categoryCourse, dateCourse);
        courseName.add(cn);
        System.out.println("Kurs został dodany : " + cn);
    }

    public void allCourse() {
        courseName.forEach(course -> System.out.println(course));
    }

    public boolean addStudent(String nameCourse, String studentFullName, String dateCourse) {
        LocalDate date = LocalDate.parse(dateCourse);
        for (int i = 0; i < courseName.size(); i++) {
            if (nameCourse.equals(courseName.get(i).getNameCourse()) && date.equals(courseName.get(i).getDateCourse())) {
                Participant p = new Participant(studentFullName);
                courseName.get(i).getStudentList().add(p);
                courseName.get(i).setCountStudent(++i);
                System.out.println("Dodano kursanta: " + studentFullName);
                return true;
            }
        }
        System.out.println("Brak kursu w bazie danych " + courseName + "Nie udało się dodać kursanta: " + studentFullName);
        return false;
    }

    public boolean deleteUser(String nameCourse, String studentFullName) {
        for (int i = 0; i < courseName.size(); i++) {
            if (courseName.equals(courseName.get(i).getNameCourse())) {
                for (int x = 0; x < courseName.get(i).getStudentList().size(); x++) {
                    if (studentFullName.equals(courseName.get(i).getStudentList().get(x).getCoursantFullName())
                            && courseName.equals(courseName.get(i).getStudentList().get(x).getCoursantFullName())) {
                        System.out.println(studentFullName + " zostal usuniety z kursu " + courseName.get(i).getNameCourse());
                        courseName.get(i).getStudentList().remove(i);
                        courseName.get(i).setCountStudent(--i);
                        return true;
                    }
                }
            }
        }
        System.out.println(studentFullName + " nie udało się usunąc kursanta");
        return false;
    }

    public int countCourse(String name_course) {
        int counter = 0;
        for (int i = 0; i < courseName.size(); i++) {
            if ((name_course.equals(courseName.get(i).getNameCourse()))) {
                counter++;
            }
        }
        return counter;
    }
}


