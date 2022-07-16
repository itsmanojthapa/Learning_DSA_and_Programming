import java.util.*;

public class Java_Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int to = sc.nextInt();
			for (int j = 0; j < to; j++) {
				temp.add(sc.nextInt());
			}
			arr.add(temp);
		}

		int f = sc.nextInt();
		for (int i = 0; i < f; i++) {
			int o = sc.nextInt();
			int p = sc.nextInt();
			if (o > arr.size() || p > arr.get(o - 1).size()) {
				System.out.println("ERROR!");
			} else {
				System.out.println(arr.get(o - 1).get(p - 1));
			}

		}
		sc.close();

	}
}