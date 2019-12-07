//package LeetCode;
//
//public class deleteDuplicates {
//    public ListNode deleteDuplicates(ListNode head) {
//        int m=head.val;
//        while (head.next!=null){
//            if (head.val!=head.next.val){
//                m=head.next.val;
//                head=head.next;
//            }
//            if (head.val!=head.next.val){
//                head=head.next.next;
//            }
//        }
//        return head;
//    }
//}
