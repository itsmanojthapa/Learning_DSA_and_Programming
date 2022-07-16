import java.util.*;

public class a8_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int mid = str.length() / 2;
		boolean ans = true;
		for (int i = 0; i < mid; i++) {

			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				ans = false;
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}