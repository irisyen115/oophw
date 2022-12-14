package class01;

class CRectangle {
    int width;
    int height;

    // (a)
    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    // (b)
    // public CRectangle() {
    // width = 10;
    // height = 8;
    // }

    // (c)
    public CRectangle() {
        this(10, 8);
    }
}

public class class01 {
    public static void main(String[] args) {
        CRectangle rectangle1 = new CRectangle(10, 8);
        System.out.println("width=" + rectangle1.width + "," + "height=" +
                rectangle1.height);

        CRectangle rectangle2 = new CRectangle();
        System.out.println("width=" + rectangle2.width + "," + "height=" +
                rectangle2.height);
    }
}