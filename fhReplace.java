import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
    String word = br.readLine();
    word = word.replace('a', 'b');
    BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt", true));
    bw.write(word);
    bw.close();
    br.close();
  }
}
