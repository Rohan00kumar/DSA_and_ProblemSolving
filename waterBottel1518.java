/**
 * waterBottel1518
 */
public class waterBottel1518 {

    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numExchange;
        while (numBottles >= numExchange) {
            total += numBottles / numExchange;
            empty = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            numBottles += empty;
        }
        return total;
    }
}