public class Quadratic {
    private double a;
    private double b;
    private double c;
    private double x;

    public double getA(double a) {
        return a;
    }

    public double getB(double b) {
        return b;
    }

    public double getC(double c) {
        return c;
    }

    public void setA() {
        a = getA(a) * x * x;
    }

    public void setB() {
        b = getB(b) * x;
    }
    
    public void setC() {
        c = getC(c);
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean hasRealRoots() {
        boolean hasRealRoots;
        hasRealRoots = getDiscriminant() >= 0;
        return hasRealRoots;
    }

    public boolean isMaximum() {
        boolean hasMaximum = a < 0;
        return hasMaximum;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double[] getRoots() {
        double[] roots = new double[2];
        if (getDiscriminant() >= 0) {
            roots[0] = (-getB(b) - (Math.sqrt(getDiscriminant()))) / (2 * a);
            roots[1] = (-getB(b) + (Math.sqrt(getDiscriminant()))) / (2 * a);
        } else {
            roots[0] = 0.0;
            roots[1] = 0.0;
        }
        return roots;
    }

    public double[] getVertex() {
        double[] roots = getRoots();
        double[] vertex = new double[2];

        vertex[0] = (roots[0] + roots[1]) / 2;
        vertex[1] = a * Math.pow(vertex[0],2) + b * vertex[0] + c;
        return vertex;
    }

    public double getYIntercept() {
        return c;
    }

    public void getStandardForm() {
        System.out.println("f(x) = " + a + "x^2 +" + b+ "x +" + c);
    }

    public void getVertexForm() {
        double [] vertex = getVertex();
        System.out.println("f(x) = " + a + "(x -" + vertex[0] + ")^2 + " + vertex[1]);
    }

    public void getFactoredForm() {
        double firstRoot = (-b - (Math.sqrt(getDiscriminant()))) / (2 * a);
        double secondRoot = (-b + (Math.sqrt(getDiscriminant()))) / (2 * a);
        System.out.println("f(x) = (x +" + firstRoot + ")(x +" + secondRoot + ")");
    }
}