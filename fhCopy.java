import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    File toRead = new File("abc.txt");
    File toWrite = new File("xyz.txt");
    copyContent(toRead, toWrite);
  }

  public static void copyContent(File a, File b) throws Exception {
    FileInputStream in = new FileInputStream(a);
    FileOutputStream out = new FileOutputStream(b);
    try {
      int n;
      while ((n = in.read()) != -1) {
        out.write(n);
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
    System.out.println("File Copied");
  }

}
