import java.util.*;

public class radixofanumber {
  public static void main(String arg[]) {
    // num = "1010110" binary redix is 2
    // "15357" decimal redix is 10
    // "A25B" hexadecimal redix is 16
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.println("Enter a no");
    str = sc.nextLine();
    if (str.matches("[0-1]+")) {
      System.out.println("Decimal, redix is 2");
    } else if (str.matches("[0-7]")) {
      System.out.println("Octal, redix is 8");
    } else if (str.matches("[0-9]+")) {
      System.out.println("Decimal, redix is 10");
    } else if (str.matches("[0-7a-fA-F]+")) {
      System.out.println("Hexadeciaml, redix is 16");
    } else {
      System.out.println("enter vail number");
    }
    sc.close();
  }
}