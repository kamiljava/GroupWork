import controller.CourseController;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MainCourse {
    public static void main(String[] args) {
        CourseController cc = new CourseController();
        Scanner sc = new Scanner(System.in);
        int decision = -1;
        while (decision != 0) {
            System.out.println("1. Dodaj kurs \n2. Pokaż wszystkie szkolenia \n3. Dodaj kursanta \n4. Usuń kursanta \n0. Wyjscie");
            decision = sc.nextInt();
            sc.nextLine();
            switch (decision) {
                case 1:
                    System.out.println("Podaj nazwe kursu");
                    String name_course = sc.nextLine();
                    System.out.println("Podaj kategorie kursu");
                    String category = sc.nextLine();
                    try {
                        System.out.println("Podaj date kursu YYYY-MM-DD");
                        String date = sc.nextLine();
                        LocalDate ldate = LocalDate.parse(date);
                        cc.addCourse(name_course, category, ldate);
                    } catch (DateTimeParseException e) {
                        System.out.println("Zle podana data");
                    }
                    break;
                case 2:
                    cc.allCourse();
                    break;
                case 3:
                    System.out.println("Podaj nazwe kursu");
                    String courseName2 = sc.nextLine();
                    System.out.println("Podaj imie i nazwisko");
                    String studentFullName2 = sc.nextLine();
                    try {
                        System.out.println("Podaj date kursu YYYY-MM-DD");
                        String date2 = sc.nextLine();
                        cc.addStudent(courseName2, studentFullName2, date2);
                    } catch (DateTimeParseException e) {
                        System.out.println("Zle podana data");
                    }
                    break;
                case 4:
                    System.out.println("Podaj nazwe kursu");
                    String courseName = sc.nextLine();
                    System.out.println("Podaj imie i nazwisko");
                    String studentFullName = sc.nextLine();
                    cc.deleteUser(courseName, studentFullName);
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        }
    }

}
