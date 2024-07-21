public class crawlerLogF1598 {
    public static int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                depth++;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println(minOperations(logs));
    }
    
}
