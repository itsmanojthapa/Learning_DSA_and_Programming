import java.io.*;

import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int max_sum = -63;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int temp_sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                temp_sum += arr.get(i + 1).get(j + 1);
                temp_sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (max_sum < temp_sum) {
                    max_sum = temp_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}
