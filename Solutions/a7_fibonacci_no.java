import java.util.*;

public class a7_fibonacci_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 0;
		int last = 1;
		int seclast = 0;
		System.out.print(0 + " ");
		for (int i = 0; i < n; i++) {

			no = last + seclast;

			System.out.print(no + " ");
			seclast = last;
			last = no;
		}

		sc.close();
	}
}