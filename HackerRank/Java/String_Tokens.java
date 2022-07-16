import java.util.*;

//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
public class String_Tokens {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        if (str.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = str.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String man : strings)
                System.out.println(man);
        }
        sc.close();
    }
}