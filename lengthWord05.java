// 05 last word length

public class lengthWord05 {
    public int lenghtOfWord(String s) {
        int count = 0;
        int i = s.length() - 1; // last index of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        } // remove spaces from the end of the string
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        } // count the length of the last word
        return count; // return the length of the last word



    }
    public static void main(String[] args) {
        lengthWord05 lw = new lengthWord05();
        String s = "Hello World";
        System.out.println(lw.lenghtOfWord(s));
    }
}
