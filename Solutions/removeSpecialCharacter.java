import java.util.*;

public class removeSpecialCharacter {
  public static void main(String arg[]) {
    String str = "  ija og a@$4.4 5#$  ";
    str = str.replaceAll("[^a-zA-Z0-9]", " ");
    // str = str.replaceAll("[^a-zA-Z0-9]","");
    String words[] = str.split("//s+");
    str = str.replaceAll("\\s+", "").trim();
    System.out.println(Arrays.toString(words));
    System.out.println(str);
  }
}