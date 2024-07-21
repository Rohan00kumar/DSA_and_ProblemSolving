public class happyNumber212 {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        return slow == 1;
    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        happyNumber212 obj = new happyNumber212();
        System.out.println(obj.isHappy(19)); // true
        System.out.println(obj.isHappy(2)); // false
    }
}
