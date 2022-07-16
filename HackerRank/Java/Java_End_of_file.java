// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;
        while (in.hasNext()) {
            String a = in.nextLine();
            System.out.println(i + " " + a);
            i++;
        }
        in.close();

    }
}
