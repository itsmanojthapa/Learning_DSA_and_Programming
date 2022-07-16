// https://www.hackerrank.com/challenges/java-static-initializer-block/submissions/code/247164373

import java.util.*;

public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sol(a, b);
        sc.close();

    }

    public static int sol(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        } else {
            int d = a * b;
            System.out.print(d);
        }
        return -1;
    }

}
