import java.util.*;

public class a4_odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any Character to Quit");
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.print(n + " is Even");
			} else {
				System.out.print(n + " is Odd");
			}
			System.out.println();
		}
		System.out.println("Process ends here");
		sc.close();
	}

}