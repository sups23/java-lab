class Main {
    public static void main(String args[]) {
        Parm p = new Parm();
        Rect r = new Rect();

        p.display();
        p.calculate(20,10);
        System.out.println();

        r.display();
        r.calculate(20,10);
    }
}
class Parm {
    void display() {
        System.out.println("Parallelogram");
    }

    void calculate(int b, int h) {
        System.out.println("Area: " + b * h);
    }
}

class Rect extends Parm {
    void display() {
        System.out.println("Rectangle");
    }

    void calculate(int l, int b) {
        System.out.println("Area: " + l * b);
    }
}