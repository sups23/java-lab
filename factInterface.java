import java.util.Scanner;

class FactInterface {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial :- ");
        int num = s.nextInt();

        Inherited obj = new Inherited();
        int result = obj.fact(num);
        
        System.out.println(result);
        s.close();
    }
}

interface Fact {
    public int fact(int n);
}

class Inherited implements Fact {
    public int fact(int n) {
        if (n >= 1)
            return n * fact(n - 1);
        else
            return 1;
    }
}
