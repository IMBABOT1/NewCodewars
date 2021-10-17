import java.util.Arrays;

public class Troll {

    public static String disemvowel(String str) {
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            result = str.replaceAll("[AEIOUaeiou]", "");
        }

        return result;
    }
}
