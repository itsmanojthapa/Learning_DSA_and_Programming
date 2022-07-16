import java.util.*;

//https://www.hackerrank.com/challenges/java-anagrams/problem
public class Java_Anagrams {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length() && ans(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        in.close();

    }

    public static boolean ans(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

        String sorted = new String(arr1);
        String sortee = new String(arr2);

        if (sorted.equals(sortee)) {
            return true;
        } else {
            return false;
        }

    }
}