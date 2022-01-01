import java.util.Arrays;

public class BreakCamelCase {

    public static String camelCase(String input) {
        int divider = 0;
        for (int i = 0; i < input.length() ; i++) {
            if (Character.isUpperCase(input.charAt(i))){
                divider = i;
            }
        }

        String[] arr = input.split("");
        String[] first = new String[divider];
        String[] second = new String[input.length() - divider];

        System.arraycopy(arr, 0, first, 0, divider);
        System.arraycopy(arr, divider, second, 0, divider + 1);

        System.out.println(Arrays.toString(first));

        System.out.println(Arrays.toString(second));


        return null;
    }

    public static void main(String[] args) {
        camelCase("camelCasing");
    }
}
