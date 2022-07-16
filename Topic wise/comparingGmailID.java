import java.util.*;

public class comparingGmailID {
  public static void main(String arg[])   
    {
      String str = "25/12/1996";
   
      dateformat(str);
    }

    public static void checkhexadecimanlornot(String str){
      System.out.println(str.matches("[0-9A-F]+"));
    }

    public static void emilidornot(String str){
      int i = str.indexOf('@');
      String userid = str.substring(0,i);
      String domainname = str.substring(i + 1, str.length());

      System.out.println(userid + " " + domainname);

      System.out.println(domainname.startsWith("gmail"));
      System.out.println(domainname.endsWith(".com"));

    }
    public static void dateformat(String str){
      //dd/mm/yy;
      System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}