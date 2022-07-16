import java.util.*;

public class Java_Subarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp_sum = 0;
				for (int k = i; k <= j; k++) {
					temp_sum += arr[k];
				}
				if (temp_sum < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}