//   https://www.hackerrank.com/challenges/30-data-types/problem

import java.util.*;

public class Day_1_Data_Types {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String c;
        scan.nextLine();
        c = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + c);

        scan.close();
    }
}
