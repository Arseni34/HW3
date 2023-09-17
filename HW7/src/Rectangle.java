public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        area = a*b;
        System.out.println("Прямоугольник площадь "+area);

        return area;
    }
    public double getPerimeter() {
        perimeter = 2 * (a+b);
        System.out.println("Прямоугольник периметр "+perimeter);

        return perimeter;
    }
}

