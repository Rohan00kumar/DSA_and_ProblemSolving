/**
 * averageWaiting1701
 */
public class averageWaiting1701 {
    public static double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int time = 0;
        double wait = 0;
        for (int i = 0; i < n; i++) {
            if (time < customers[i][0]) {
                time = customers[i][0];
            }
            time = time + customers[i][1];
            wait = wait +  time - customers[i][0];
        }
        return wait / n;
    }

    public static void main(String[] args) {
        int[][] customers = { { 1, 2 }, { 2, 5 }, { 4, 3 } };
        System.out.println(averageWaitingTime(customers));
    }   
}