import java.util.*;

public class protocolusedofwebsite {
  public static void main(String arg[]) {
    // DomainName
    // https://www.google.com (.com-> type of website is) com means commercial,gov
    // goverment,org organisation,net network,biz busigness
    // protocol, world wide web,
    Scanner sc = new Scanner(System.in);
    String url;
    System.out.println("Enter the URL");
    url = sc.nextLine();
    String protocol = url.substring(0, url.indexOf(":"));

    if (protocol.equals("http")) {
      System.out.println("Hyper text transfer protocol");
    } else if (protocol.equals("ftp")) {
      System.out.println("File transfer protocol");
    }

    String ext = url.substring(url.lastIndexOf(".") + 1);
    if (ext.equals("com")) {
      System.out.println("Commercial");
    } else if (ext.equals("org")) {
      System.out.println("Organisation");
    } else if (ext.equals("net")) {
      System.out.println("Network");
    }

    sc.close();

  }
}