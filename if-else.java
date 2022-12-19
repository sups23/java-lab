import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner numberObj = new Scanner(System.in);
        System.out.println("\n#### OddEven Finder ####\n");
        System.out.print("Enter a number :- ");
        int number = numberObj.nextInt();

        oddEvenFinder(number);
        numberObj.close();
    }

    public static void oddEvenFinder(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
