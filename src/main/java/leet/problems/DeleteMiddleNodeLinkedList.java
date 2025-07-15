package leet.problems;

public class DeleteMiddleNodeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteMiddle(ListNode head){
//validation for single node to return null
        if(head.next == null) {
            return null;
        }
        //initialize a count o
    }
}
