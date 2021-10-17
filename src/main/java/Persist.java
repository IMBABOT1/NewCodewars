import java.util.Arrays;

public class Persist {
    public static int persistence(long n) {
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        long[] numbers = new long[arr.length];

        while (amount(numbers) > 1) {
            res = multiply(numbers);
            amount(res);
        }

        System.out.println(result);

        return result;
    }

    private static long multiply(long[] n){
        long result = 1;
        for (long element : n){
            result *= element;
        }
        return result;
    }

    private static int amount(long[] n){
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        long[] numbers = new long[arr.length];
        int result = 0;


        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.valueOf(arr[i]);
        }


        for (int i = 0; i < n.length ; i++) {
            result++;
        }

        return result;
    }
}
