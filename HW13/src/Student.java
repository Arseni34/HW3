import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student {
    String name;
    int group;
    int course;

    ArrayList<Integer> marks;

    public Student(String name, int group, int course, ArrayList<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public Student() {
    }

    public double getAverageMark() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public static void removeStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageMark() < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}