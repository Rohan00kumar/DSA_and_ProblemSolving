/**
 * addBinary67
 */
public class addBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        addBinary67 obj = new addBinary67();
        System.out.println(obj.addBinary("11", "1")); // 100
    }
}