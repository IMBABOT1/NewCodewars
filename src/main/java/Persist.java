import java.util.Arrays;

public class Persist {
    public static int persistence(long n) {
        amount(n);
        return 1;
    }

    private static long amount(long n) {
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        long[] numbers = new long[arr.length];
        int amount = 0;
        long result = 1;


        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.valueOf(arr[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            amount++;
        }


        if (amount >= 2) {
            for (long element : numbers) {
                result *= element;
                amount(result);
            }
        }

        System.out.println(result);

        return result;

    }
}
