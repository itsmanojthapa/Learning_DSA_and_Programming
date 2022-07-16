// https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if ((int) A.charAt(0) > (int) B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String firstLetStr = A.substring(0, 1);
        String remLetStr = A.substring(1);
        String firstLetStr1 = B.substring(0, 1);
        String remLetStr2 = B.substring(1);

        System.out.println(firstLetStr.toUpperCase() + remLetStr + " " + firstLetStr1.toUpperCase() + remLetStr2);
        sc.close();
    }
}
