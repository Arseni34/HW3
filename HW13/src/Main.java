import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Set<Integer> Numbers = new HashSet<>();
        System.out.println("Введите набор чисел через запятую и пробел: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numberString = input.split(",\\s+");
        for (String numStr : numberString) {
                int num = Integer.parseInt(numStr);
                Numbers.add(num);
        }
        System.out.print("Уникальные числа: ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }
            System.out.println();

            System.out.println("Task 2");
            System.out.println("Добавить животное - 1");
            System.out.println("Удалить последнее - 2");
            System.out.println("Выйти - 3");
            int a;
            while (true) {
                a = scanner.nextInt();
                if (a==1) {
                    Animals.add();
                    System.out.println(Animals.animals);
                }
                else if (a==2) {
                    Animals.delete();
                    System.out.println(Animals.animals);
                }
                else break;
            }



        System.out.println("Task 3");
        System.out.println("Введите количество студентов: ");
            int numberOfStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Введите имя студента: ");
            String studentName = scanner.next();

            System.out.println("Введите группу студента: ");
            int studentGroup = scanner.nextInt();
            System.out.println("Введите курс студента: ");
            int course = scanner.nextInt();
            System.out.println("Введите количество оценок студента: ");
            int numberOfMarks= scanner.nextInt();

            System.out.println("Введите оценки студента: ");
            ArrayList<Integer> studentMarks = new ArrayList<>();
            for (int j = 0; j < numberOfMarks; j++) {
                int mark = scanner.nextInt();
                studentMarks.add(mark);
            }

            Student student = new Student(studentName, studentGroup, course,studentMarks);
            students.add(student);
        }
        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.name);
            System.out.println("Группа: " + student.group);
            System.out.println("Курс: " + student.course);
            System.out.println("Оценки: " + student.marks);
            System.out.println();
        }
        System.out.println("Удаление студентов с баллом ниже 3 ");
        Student.removeStudents(students);

        System.out.println("Обновленный список студентов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.name);
            System.out.println("Группа: " + student.group);
            System.out.println("Курс: " + student.course);
            System.out.println("Оценки: " + student.marks);
            System.out.println();
        }
        System.out.println("Введите курс, который вы хотите просмотреть: ");
        int course1= scanner.nextInt();
        Student.printStudents(students, course1);
    }
}
