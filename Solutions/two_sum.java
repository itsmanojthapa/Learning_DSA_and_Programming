import java.util.*;

public class two_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 7, 11, 15 };
		int target = 20;
		System.out.println(Arrays.toString(twosum(arr, target)));
		sc.close();
	}

	public static int[] twosum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
}