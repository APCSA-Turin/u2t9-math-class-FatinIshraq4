public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        double b2 = Math.pow(base, 2);
        double h2 = Math.pow(height, 2);
        double z = b2 + h2;
        double last = Math.sqrt(z);
        return last;
    }

    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double hyp1 = tri1.hypotenuse();
        double hyp2 = tri2.hypotenuse();
        System.out.println(hyp1);
        System.out.println(hyp2);
    }
}

