import java.util.*;

public class a5_greeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		System.out.println("Hey,Thanks for checking out " + str);
		sc.close();
	}
}