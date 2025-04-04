public class Quadratic {
    private double a;
    private double b;
    private double c;

    public double getA(double a) {
        this.a = a;
        return a;
    }

    public double getB(double b) {
        this.b = b;
        return b;
    }

    public double getC(double c) {
        this.c = c;
        return c;
    }

    public Quadratic(double a, double b, double c) {
        this.a = getA(a);
        this.b = getB(b);
        this.c = getC(c);
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public void getFactoredForm() {
        double firstRoot = (-b - (Math.sqrt(getDiscriminant()))) / (2 * a);
        double secondRoot = (-b + (Math.sqrt(getDiscriminant()))) / (2 * a);
        System.out.println("Factored form: (x +" + firstRoot + ")(x +" + secondRoot + ")");
    }

    public double[] getRoots() {
        double[] roots = new double[2];
        if (getDiscriminant() >= 0) {
            roots[0] = (-b - (Math.sqrt(getDiscriminant()))) / (2 * a);
            roots[1] = (-b + (Math.sqrt(getDiscriminant()))) / (2 * a);
        } else {
            roots[0] = 0.0;
            roots[1] = 0.0;
        }
        return roots;
    }

    public void 
    getStandardForm()
}
