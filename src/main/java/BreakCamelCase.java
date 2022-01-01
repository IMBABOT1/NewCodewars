import java.util.Arrays;

public class BreakCamelCase {

    public static String camelCase(String input) {
        String result = "";
        boolean bool = false;

        for (int i = 0; i < input.length() ; i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                bool = true;
            }
        }

        if (bool){
            result = input.replaceAll("(.)([A-Z])", "$1 $2");
        }else {
            result = input;
        }

        return result;
    }

    public static void main(String[] args) {
        camelCase("camelCasingTest");
    }
}
