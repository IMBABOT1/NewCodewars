import java.util.Arrays;

public class Persist {
    public static int persistence(long n) {
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.valueOf(arr[i]);
        }

        System.out.println(Arrays.toString(numbers));

        return 1;
    }
}
