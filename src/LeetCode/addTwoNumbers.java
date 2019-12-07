package LeetCode;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode l3=new ListNode(0);
        ListNode p=l1;
       ListNode q=l2;
       ListNode head=l3;
       int temp=0;
       while (p!=null||q!=null){
           int x=(p!=null)?p.val:0;
           int y=(q!=null)?q.val:0;
           int sum=temp+x+y;
           temp=sum/10;
           head.next=new ListNode(sum%10);
           head=head.next;
           if (p!=null) p=p.next;
           if (q!=null)q=q.next;
       }
       if (temp>0){
           head.next=new ListNode(temp);
       }
       return head.next;

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
