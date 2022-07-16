// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Java_Date_and_Time {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String res = findDay(month, day, year);
        sc.close();
        System.out.println(res);
    }

    public static String findDay(int month, int day, int year) throws ParseException {
        String sDay = month + "/" + day + "/" + year;
        SimpleDateFormat dayOfSimpleDateForTheWeek = new SimpleDateFormat("EEEE");
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yy");
        String ans = dayOfSimpleDateForTheWeek.format(format1.parse(sDay));
        ans = ans.toUpperCase();
        return ans;
    }

}
