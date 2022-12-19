import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String s = input.next();
        char c = s.toLowerCase().charAt(0);
        char w = s.charAt(0);

        char arr[] = { 'a', 'e', 'i', 'o', 'u' };

        if (new String(arr).contains(Character.toString(c))) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("vowels.txt", true));
            bw.write(w + " ");
            bw.close();
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter("consonants.txt", true));
            bw.write(w + " ");
            bw.close();
        }

        input.close();
    }
}