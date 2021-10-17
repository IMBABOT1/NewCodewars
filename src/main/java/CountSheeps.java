public class CountSheeps {


    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;

        for (int i = 0; i < arrayOfSheeps.length ; i++) {
            if (arrayOfSheeps[i] == null) {
                continue;
            } else if (arrayOfSheeps[i] == true){
                counter++;
            }
        }
        return counter;
    }
}
