import java.io.*;

public class Fileprpgram {
    public static void main(String[] args) {
    File file = new File("Top.txt");
    if(file.exists()){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }


    try{
    FileWriter filee = new FileWriter("Top.txt");
    file.write("Manoj Thapa writes");
    file.close();}
    catch(IOException e){
      System.out.println("Sorry");
    }
    }
}
