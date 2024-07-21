/**
 * scoringRemovingString1717
 */
public class scoringRemovingString1717 {
    public int maximumGain(String s, int x, int y) {
        int res = 0;
        if (x < y) {
            res = remove(s, "ab", y);
            res += remove(s, "ba", x);
        } else {
            res = remove(s, "ba", x);
            res += remove(s, "ab", y);
        }
        return res;
    }

    private int remove(String s, String str, int x) {
        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c);
            if (sb.length() >= 2 && sb.substring(sb.length() - 2).equals(str)) {
                sb.setLength(sb.length() - 2);
                res += x;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        scoringRemovingString1717 s = new scoringRemovingString1717();
        System.out.println(s.maximumGain("cdbcbbaaabab", 4, 5));
    }
}