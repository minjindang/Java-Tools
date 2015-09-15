import java.io.*;

public class UseReaderWriter {
  public static void main(String[] args){
    FileReader fr;
    FileWriter fw;
    int i;
    try{
      fr = new FileReader("File1.txt");
      fw = new FileWriter("File3.txt", true);
      while (fr.ready()){
        i = fr.read();
        System.out.print((char) i);
        fw.write(i);
      }
      fr.close();
      fw.close();
    }catch(IOException ex){
      System.out.println(ex.toString());
    }
    System.out.println("\n \n Log Catch Done!");
  }
}
