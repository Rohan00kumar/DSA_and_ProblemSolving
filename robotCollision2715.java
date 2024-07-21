import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * robotCollision2715
 */
public class robotCollision2715 {

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of robots' indices

        for (int i = 0; i < n; i++) {
            if (directions.charAt(i) == 'r') {
                stack.push(i); // Push the index of the robot moving to the right
            } else {
                // Process collisions for robots moving to the left
                while (!stack.isEmpty() && healths[i] > 0) {
                    int rightRobotIndex = stack.peek();
                    if (positions[rightRobotIndex] < positions[i]) {
                        if (healths[rightRobotIndex] > healths[i]) {
                            healths[rightRobotIndex] -= healths[i];
                            healths[i] = 0;
                        } else if (healths[rightRobotIndex] < healths[i]) {
                            healths[i] -= healths[rightRobotIndex];
                            healths[rightRobotIndex] = 0;
                            stack.pop();
                        } else {
                            // Both robots have the same health and destroy each other
                            healths[rightRobotIndex] = 0;
                            healths[i] = 0;
                            stack.pop();
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int health : healths) {
            if (health > 0) {
                res.add(health);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        robotCollision2715 r = new robotCollision2715();
        int[] positions = { 1, 3, 5, 7, 9 };
        int[] healths = { 10, 10, 10, 10, 10 };
        String directions = "rrrrl";
        System.out.println(r.survivedRobotsHealths(positions, healths, directions)); // [10, 10, 10, 10]

        int[] positions2 = { 1, 2, 3, 4, 5 };
        int[] healths2 = { 1, 2, 3, 4, 5 };
        String directions2 = "rrlrl";
        System.out.println(r.survivedRobotsHealths(positions2, healths2, directions2)); // [2, 3, 5]
    }
}
