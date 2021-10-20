import java.util.Arrays;

public class SquareDigits {

    public static int squareDigits(int n) {
        String temp = String.valueOf(n);
        String[] numbersToSquare = temp.split("");
        int[] square = new int[numbersToSquare.length];

        for (int i = 0; i < square.length ; i++) {
            square[i] = Integer.valueOf(numbersToSquare[i]);
        }

        String[] result = new String[square.length];
        for (int i = 0; i < square.length ; i++) {
            square[i] *= square[i];
        }

        for (int i = 0; i < square.length ; i++) {
            result[i] = String.valueOf(square[i]);
        }


        String res = "";
        for (int i = 0; i < result.length ; i++) {
            res += result[i];
        }

        int ress = Integer.valueOf(res);

        return ress;
    }

}
