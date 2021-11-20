import java.util.Arrays;

public class Accumul {

    public static String accum(String s) {
        String[] temp = s.split("");
        StringBuilder sb = new StringBuilder();

        int counter = 0;
        while (counter < temp.length) {
            for (int i = -1; i < counter ; i++) {
                System.out.println(temp[counter]);
            }
            counter++;
        }
        return "";
    }
}


