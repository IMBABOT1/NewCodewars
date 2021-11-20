import java.util.Arrays;
import java.util.Locale;

public class Accumul {

    public static String accum(String s) {
        String[] temp = s.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();

        int counter = 0;
        while (counter < temp.length) {
            for (int i = -1; i < counter ; i++) {
                sb.append(temp[counter]);
            }
            sb.append("-");
            counter++;
        }

        String result = sb.toString().toLowerCase(Locale.ROOT);
        String[] arr = result.split("");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("-")){
               arr[i+1] = arr[i+1].replaceAll(arr[i+1], arr[i+1].toUpperCase(Locale.ROOT));
            }
        }
        arr[0] = arr[0].toUpperCase(Locale.ROOT);


        for (int i = 0; i < arr.length ; i++) {
            if (!arr[i].equals(",")){
                res.append(arr[i]);
            }
        }


        res.setLength(res.length() - 1);
        return res.toString();
    }
}


