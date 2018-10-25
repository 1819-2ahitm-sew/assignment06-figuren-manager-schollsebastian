public class Circle extends Figure {

    private double r;

    //region Constructor and Getter
    public Circle(double radius) {
        r = radius;
    }

    public double getR() {
        return r;
    }
    //endregion

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double circumference() {
        return 2 * r * Math.PI;
    }

    @Override
    public String output() {
        return "Kreis mit Radius = " + r + ": " +
                "A = " + area() + ", u = " + circumference();
    }

}
