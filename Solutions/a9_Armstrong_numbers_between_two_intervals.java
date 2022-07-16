import java.util.*;

public class a9_Armstrong_numbers_between_two_intervals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Range : ");
		int a = in.nextInt();
		int b = in.nextInt();

		int n = 0, temp1, temp2, ans = 0, remainder;

		for (int i = a; i < b; i++) {
			temp1 = i;
			temp2 = i;
			while (temp1 != 0) {
				temp1 /= 10;
				n++;
			}

			while (temp2 != 0) {
				remainder = temp2 % 10;
				ans += Math.pow(remainder, n);
				temp2 /= 10;
			}

			if (ans == i) {
				System.out.print(i + " ");
			}
			n = 0;
			ans = 0;
		}
		in.close();

	}
}
