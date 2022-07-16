import java.util.*;

public class a6_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter Operator");
			char op = sc.next().trim().charAt(0);
			if (op == '/' || op == '*' || op == '+' || op == '-' || op == '%') {
				System.out.println("Enter two Numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int ans = 0;
				switch (op) {
					case '+':
						ans = a + b;
						break;
					case '-':
						ans = a - b;
						break;
					case '/':
						ans = a / b;
						break;
					case '*':
						ans = a * b;
						break;
					case '%':
						ans = a % b;
						break;
				}
				System.out.println(ans);

			} else if (op == 'Q' || op == 'q') {
				break;
			} else {
				System.out.println("Not Valid");
			}

		}
		System.out.println("Closed");
		sc.close();
	}
}