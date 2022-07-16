import java.util.*;

public class a1_Leap_Year {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 100 == 0 && n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
			System.out.println("LEEP YEAR");
		} else {
			System.out.println("NOT YEAR");
		}

		// if(n% 400==0){
		// System.out.println("LEEP YEAR");
		// }else if(n%100 == 0){
		// System.out.println("NOT LEEP YEAR");
		// }else if(n%4 ==0){
		// System.out.println("LEEP YEAR");
		// }
		// System.out.println(n);
		sc.close();
	}

}