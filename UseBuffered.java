import java.io.*;
public class UseBuffered{
  public static void main(String[] args) throws IOException {
    String[] s = {"AAA","BBB","CCC"};
    FileWriter fw = new FileWriter("log.txt");
    BufferedWriter bw = new BufferedWriter(fw);

    for(String element : s){
      bw.write(element);
      bw.newLine();
    }
    bw.close();
  }
}
