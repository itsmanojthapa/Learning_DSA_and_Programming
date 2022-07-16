//https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29
import java.io.*;
import java.math.*;

public class PrimeTester {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(bufferedReader.readLine());
        bufferedReader.close();

        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");

    }
}
