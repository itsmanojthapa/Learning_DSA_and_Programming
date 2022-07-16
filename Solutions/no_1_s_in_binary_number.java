//count the number of 1’s in a binary representation of the number.
public class no_1_s_in_binary_number {

    public static void main(String[] args) {

        int n = 100; // 0101

        System.out.println(ans(n));
    }

    static int ans(int n) {

        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

}