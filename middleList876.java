/**
 * middleList876
 */
public class middleList876 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            // slow pointer moves 1 step
            slow = slow.next;
            // fast pointer moves 2 steps
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        middleList876 middleList876 = new middleList876();
        ListNode head = middleList876.new ListNode(1);
        head.next = middleList876.new ListNode(2);
        head.next.next = middleList876.new ListNode(3);
    }
}