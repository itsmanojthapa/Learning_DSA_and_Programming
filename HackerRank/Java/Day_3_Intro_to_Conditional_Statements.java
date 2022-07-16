// https://www.hackerrank.com/challenges/30-conditional-statements/problem

import java.io.*;

public class Day_3_Intro_to_Conditional_Statements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int x = N % 2;

        if (x == 1) {
            System.out.println("Weird");
        } else if (x == 0 && N <= 5 && N >= 2) {
            System.out.println("Not Weird");
        } else if (x == 0 && N <= 20 && N >= 6) {
            System.out.println("Weird");
        }
        // else if(x==0 && 20<x){

        else {
            System.out.println("Not Weird");
        }
    }
}
