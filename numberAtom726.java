// import java.util.Map;
// import java.util.Stack;
// import java.util.TreeMap;

// public class numberAtom726 {
//     public String countOfAtoms(String formula) {
//         int n = formula.length();
//         Stack<Map<String, Integer>> stack = new Stack();
//         stack.push(new TreeMap());

//         for (int i = 0; i < n;) {
//             if (formula.charAt(i) == '(') {
//                 stack.push(new TreeMap());
//                 i++;
//             } else if (formula.charAt(i) == ')') {
//                 Map<String, Integer> top = stack.pop();
//                 int iStart = ++i, multiplicity = 1;
//                 while (i < n && Character.isDigit(formula.charAt(i)))
//                     i++;
//                 if (i > iStart)
//                     multiplicity = Integer.parseInt(formula.substring(iStart, i));
//                 for (String c : top.keySet()) {
//                     int count = top.get(c);
//                     stack.peek().put(c, stack.peek().getOrDefault(c, 0) + count * multiplicity);
//                 }
//             } else {
//                 int iStart = i++;
//                 while (i < n && Character.isLowerCase(formula.charAt(i)))
//                     i++;
//                 String name = formula.substring(iStart, i);
//                 iStart = i;
//                 while (i < n && Character.isDigit(formula.charAt(i)))
//                     i++;
//                 int count = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
//                 stack.peek().put(name, stack.peek().getOrDefault(name, 0) + count);
//             }
//         }

//         StringBuilder ans = new StringBuilder();
//         for (String name : stack.peek().keySet()) {
//             ans.append(name);
//             int count = stack.peek().get(name);
//             if (count > 1)
//                 ans.append(count);
//         }
//         return new String(ans);

//     }
//     public static void main(String[] args) {
//         numberAtom726 obj = new numberAtom726();
//         System.out.println(obj.countOfAtoms("K4(ON(SO3)2)2")); // K4N2O14S4

//     }
// }
