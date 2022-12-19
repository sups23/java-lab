import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner monthObj = new Scanner(System.in);
        System.out.println("\n#### Season Finder ####\n");
        System.out.print("Enter month -> (1-12)(Jan-Dec): ");
        int month = monthObj.nextInt();

        seasonFinder(month);
        monthObj.close();
    }

    public static void seasonFinder(int month) {
        switch (month) {
            case 1, 2, 12:
                System.out.println("It's Winter.");
                break;

            case 3, 4, 5:
                System.out.println("It's Spring.");
                break;

            case 6, 7, 8:
                System.out.println("It's Summer.");
                break;

            case 9, 10, 11:
                System.out.println("It's Autumn.");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
