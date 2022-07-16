import java.io.*;
import java.util.*;

public class RecursionQuestions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		// int b = sc.nextInt();
		System.out.println(reverse(n));
	}



	public static int sumOfItsDigits(int n)
	{
	//154=1+5+4
		if(n<0){
			return -1;
		}
		if(n < 10){
            return n;
		}
        return n%10+ sumOfItsDigits(n/10);
	}
   
 
    public static int power(int base, int power)
    {

    	if(power < 0){
    		return -1;
    	}
    	if(power == 0 || power == 1 ){
    		return base;
    	}
        
        return base*power(base , power-1);
    } 
 

    public static int gDC(int a, int b)
    {   //gratest common deviser 8,12 is 4
        //Euclidean Algorithm
        if(a<0 || b<0){
        	return -1;
        }
        if(b == 0){
        	return a;
        }

        return gDC(b, a%b);
    }


    public static int decimalTOBinary(int n)
    {
    //13 = 1101
    	if(n == 0){
    		return 0;
    	}
    	return n%2 + 10*decimalTOBinary(n/2);
    }

    public static int productofArray(int A[], int N) 
    { 
        if (N <= 0) 
            return 1; 
        return (productofArray(A, N - 1) * A[N - 1]); 
    } 

    public static int recursiveRange(int num) 
    {
	     if (num<=0) {
	       return 0;
	     }
	     return num + recursiveRange(num - 1);
    } 

    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static  boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
          return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }


    public static boolean someRecursive(int[] arr, OddFunction odd) 
    {
	    if (arr.length == 0 ) {
	      return false;
	    } else if (odd.run(arr[0]) == false) {
	      return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
	    } else {
	      return true;
	    }
    }    

    static char first(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }

    public static String capitalizeWord(String str)
    {  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim(); 
    }
   
}