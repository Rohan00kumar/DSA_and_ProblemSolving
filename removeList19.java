// public class removeList19 {
//     class ListNodde {
//         int val;
//         ListNodde next;
//         ListNodde() {

//         }
        
//         ListNode(int val){
//             this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }

//     public ListNode removeFromEnd(ListNodde head, int n) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode first = dummy;
//         ListNode second = dummy;

//         for (int i = 1; i <= n + 1; i++) {
//             first = first.next;
//         }

//         while (first != null) {
//             first = first.next;
//             second = second.next;
//         }

//         second.next = second.next.next;
//         return dummy.next;
//     }
// }
