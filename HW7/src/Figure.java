public abstract class Figure {
    public String name;
    protected double area;
    protected double perimeter;

    public Figure() {
    }

    public abstract double getPerimeter();
    public abstract double getArea();

}
