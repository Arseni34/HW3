public class Circle extends Figure {
    private double radius;
    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 3.14 * radius * radius;
        System.out.println("Круг площадь "+ area);

        return area;
    }
    public double getPerimeter() {
        perimeter = 2 * 3.14 * radius;
        System.out.println("Круг периметр "+perimeter);

        return perimeter;
    }
}

