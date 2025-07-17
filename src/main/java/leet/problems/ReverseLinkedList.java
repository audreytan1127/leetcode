package leet.problems;

public class ReverseLinkedList {
    private class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head){
        //initialize pointers for current index, next, and previous
        ListNode current = head, previous = null, nextNode = null;
        //while the current index is not null
        while(current != null){
            //stores the next index as the current +1
            nextNode = current.next;
            //sets the next node as the previous to print backwards
            current.next = previous;
            //move the pointers up
            previous = current;
           current = nextNode;
        }
        //return previous to print list backwards
        return previous;
    }
}
