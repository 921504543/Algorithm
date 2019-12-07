//package LeetCode;
//
//public class mergeTwoLists {
// /*   public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head=null;
//        while (l1.next!=null&&l2.next!=null){
//            if (l1.val>=l2.val){
//                head.val=l2.val;
//                l2=l2.next;
//            }
//            else {
//                head.val=l1.val;
//                l1=l1.next;
//            }
//            head=head.next;
//        }
//        if (l1.next!=null){
//            while (l1.next!=null){
//                head=head.next;
//                l1=l1.next;
//                head.val=l1.val;
//            }
//        }
//        else if (l2.next!=null){
//            while (l2.next!=null){
//                head=head.next;
//                l2=l2.next;
//                head.val=l2.val;
//            }
//        }
//        return head;
//    }
//}
