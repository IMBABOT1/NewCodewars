public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int result = 0;
        int counter = 0;


        while (p0 < p) {
            result = (int) (p0 + (p0 * (percent / 100)) + aug);
            p0 = result;
            counter++;

        }

        return counter;
    }
}
