// https://www.hackerrank.com/challenges/java-int-to-string/problem

import java.util.*;

public class Java_Int_to_String {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 100 && x >= -100) {
            System.out.println("Good job");

        } else {
            System.out.println("Wrong answer");
        }
        sc.close();

    }
}
