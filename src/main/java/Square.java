public class Square extends Figure {

    private double a;

    //region Constructor and Getter
    public Square(double seite) {
        a = seite;
    }

    public double getA() {
        return a;
    }
    //endregion

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double circumference() {
        return a * 4;
    }

    @Override
    public String output() {
        return "Quadrat mit Seitenlänge = " + a + ": " +
                "A = " + area() + ", u = " + circumference();
    }
}
