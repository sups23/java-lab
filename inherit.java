/**
 * inherit
 */
public class inherit {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Parm p = new Parm(10, 6, false);
        Rect r = new Rect(12, 8);
        
        c.area();
        p.area();
        r.area();
    }
}

class Circle extends Shape {
    final float pi = 3.14f;
    private int r;

    Circle(int r) {
        super("circle");
        System.out.println();

        this.r = r;
    }

    public void area() {
        System.out.println("The area of the circle is " + (this.pi * r * r));
    }
}

class Parm extends Shape {
    private int b;
    private int h;

    Parm(int b, int h, boolean isRect) {
        super("Parallelogram");
        if (isRect) {
            System.out.println("Rectangle too");
        }
        System.out.println();

        this.b = b;
        this.h = h;
    }

    public void area() {
        System.out.println("The area of the rectangle is " + (this.b * this.h));
    }
}

class Rect extends Parm {
    private int l;
    private int b;

    Rect(int l, int b) {
        super(l, b, true);
        System.out.println();

        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("The area of the rectangle is " + (this.l * this.b));
    }
}

class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
        System.out.println("The shape is " + this.name);
    }
}
