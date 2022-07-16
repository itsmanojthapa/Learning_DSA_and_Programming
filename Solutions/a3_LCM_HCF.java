import java.util.*;

//Euclidean Algorithm for finding GCD
public class a3_LCM_HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int x, y, t, gdc, lcm;
			x = a;
			y = b;
			while (y != 0) {
				t = y;
				y = x % y;
				x = t;
			}
			gdc = x;
			lcm = (a * b) / gdc;
			System.out.println("Your HCF and LCM is: " + gdc + " || " + lcm);
		}
		sc.close();
	}
}