class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    void setRadius(int r) {
        radius = r;
    }

    double surfaceArea() {
        return 4 * 3.14 * Math.pow(radius, 2);
    }

    double volumn() {
        return 0.75 * 3.14 * Math.pow(radius, 3);
    }

    void showCenter() {
        System.out.println("x=" + x + "," + "y=" + y + "," + "z=" + z);
    }
}

public class class16 {
    public static void main(String[] args) {
        CSphere sphere;
        sphere = new CSphere();

        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);

        System.out.println("surfaceArea=" + sphere.surfaceArea());
        System.out.println("volumn=" + sphere.volumn());
        sphere.showCenter();
    }
}
