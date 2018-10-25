public class Ellipse extends Figure {

    private double a;
    private double b;

    //region Constructor and Getter
    public Ellipse(double hauptachse, double nebenachse) {
        a = hauptachse;
        b = nebenachse;
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
        return a * b * Math.PI;
    }

    @Override
    public double circumference() {

        double lambda = (a - b) / (a + b);
        return (a + b) * Math.PI * (1 + ((3 * lambda * lambda)) / (10 + Math.sqrt(4 - 3 * lambda * lambda)));

    }

    @Override
    public String output() {
        return "Ellipse mit Hauptachse = " + a + " und Nebenachse = " + b + ": " +
                "A = " + area() + ", u = " + circumference();
    }

}
