import java.util.*;

//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = str.length() / 2;

		System.out.println(ans(str, x));
		sc.close();
	}

	public static String ans(String str, int x) {
		for (int i = 0; i < x; i++) {

			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {

			} else {
				return "No";
			}

		}
		return "Yes";
	}
}