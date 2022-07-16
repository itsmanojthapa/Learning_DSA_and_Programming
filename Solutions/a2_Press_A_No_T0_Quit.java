import java.util.*;

public class a2_Press_A_No_T0_Quit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			// sc.next().charAt(0);
			// sc.next().charAt(0);
			// if(sc.hasNext()){
			// if(sc.nextLine().charAt(0)=='Q' || sc.nextLine().charAt(0)=='q'){
			// break;
			// }
			// }
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		System.out.println("Process Ends Here");
		sc.close();
	}
}