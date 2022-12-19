import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        try {
            int arr[] = new int[5];
            arr[10] = 44 / 0;
        }

        catch(ArithmeticException e) {
            System.out.println(e.toString());
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        finally {
            System.out.println("Finally block.");
        }

        Exceptions obj = new Exceptions();
        Scanner scanObj = new Scanner(System.in);
        System.out.print("\nSquare root of ?: ");
        double input = scanObj.nextDouble();
        obj.root(input);

        Throws throwObj = new Throws();
        System.out.print("\nm is ?: ");
        double m = scanObj.nextDouble();
        System.out.print("\nn is ?: ");
        double n = scanObj.nextDouble();

        try {
            throwObj.div(m, n);
        }
        catch(ArithmeticException e) {
            System.out.println(e.toString()); // x / 0 - will give infinity for double : https://stackoverflow.com/questions/18542536/why-is-number-divided-by-zero-infinity-in-java
        }

        scanObj.close();
    }
}

class Exceptions {
    void root(double num) {
        if(num < 0)
            throw new ArithmeticException("\nNegative number");
        else
            System.out.println("Squre root of " + num + " is: " + Math.sqrt(num));
    }
}

class Throws {
    void div(double m, double n) throws ArithmeticException {
        System.out.println("\n" + m + " / " + n + " is " + m / n);
    }
}