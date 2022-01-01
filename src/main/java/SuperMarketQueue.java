public class SuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int time = 0;
        int result = 0;


        for (int i = 0; i < customers.length ; i++) {
            time += customers[i];
        }

        if (customers.length == 0){
            result = 0;
        }else {
            result = time / n;
        }

        return result;

    }
}
