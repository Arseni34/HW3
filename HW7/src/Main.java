import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Директор director = new Директор();
        Рабочий rabochii= new Рабочий();
        Бухгалтер buchgalter = new Бухгалтер();
        director.printName();
        buchgalter.printName();
        rabochii.printName();
        System.out.println("Task 2");
Circle circle = new Circle(  5);
        circle.getArea();
        circle.getPerimeter();
Triangle triangle = new Triangle(3,2,3);
triangle.getArea();
triangle.getPerimeter();
Rectangle rectangle = new Rectangle(3,6);
rectangle.getArea();
rectangle.getPerimeter();
        System.out.println();
        System.out.println();
        ArrayList<Figure>figures = new ArrayList<Figure>();
        Figure figure1 = new Circle (3);
        Figure figure2 = new Rectangle(3,8);
        Figure figure3 = new Triangle(4,8,9);
        Figure figure4 = new Rectangle(5,7);
        Figure figure5 = new Circle (6);
        figures.add(figure1);
        figures.add(figure2);
        figures.add(figure3);
        figures.add(figure4);
        figures.add(figure5);
        double sum = 0;
for (Figure figure : figures){
    sum+=figure.getPerimeter();
        }
System.out.println("Сумма периметров "+ sum);
    }
}