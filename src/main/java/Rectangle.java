public class Rectangle extends Figure {

    private double a;
    private double b;

    //region Constructor and Getter
    public Rectangle(double laenge, double breite) {
        a = laenge;
        b = breite;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    //endregion

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circumference() {
        return (a + b) * 2;
    }

    @Override
    public String output() {
        return "Rechteck mit Länge = " + a + " und Breite = " + b + ": " +
                "A = " + area() + ", u = " + circumference();
    }

}
