class Circle extends Shape {
    static String cname = "Circle";
    final float pi = 3.14f; 
    private int r;
    
    Circle (int r) {
        super();
        this.r = r;
    }

    public void area() {
        System.out.println("The area of the circle is " + (this.pi*r*r));
    }

    static void displayCircleInfo() {
        System.out.println("The formula for area of circle is pi*r^2.");
    }
    public static void main(String args[]) {
        Circle c = new Circle(7);

        displayCircleInfo();
        System.out.println("Shape name is " + cname);

        c.area();
    }
}

class Shape {
    Shape() {
        System.out.println("The parent shape class.");
    }
}
