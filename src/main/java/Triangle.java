public class Triangle extends Figure {

    private double a;
    private double b;
    private double gamma;

    //region Constructor and Getter
    public Triangle(int seite1, int seite2, int eingeschlossenerWinkel) {
        a = seite1;
        b = seite2;
        gamma = eingeschlossenerWinkel * Math.PI / 180;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getGamma() {
        return gamma;
    }
    //endregion

    @Override
    public double area() {
        return a * b * Math.sin(gamma) / 2;
    }

    @Override
    public double circumference() {

        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(gamma));
        return a + b + c;

    }

    @Override
    public String output() {
        return "Dreieck mit Seitenlänge 1 = " + a + " und Seitenlänge 2 = " + b + ": " +
                "A = " + area() + ", u = " + circumference();
    }

}
