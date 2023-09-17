public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double getArea() {
       double pp = (a+b+c)/2;
        area = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
        System.out.println("Треугольник площадь "+area);
        return area;
    }
    public double getPerimeter() {
        perimeter = a+b+c;
        System.out.println("Треугольник периметр "+perimeter);

        return perimeter;
    }
}

