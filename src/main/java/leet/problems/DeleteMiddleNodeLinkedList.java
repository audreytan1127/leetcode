package leet.problems;

public class DeleteMiddleNodeLinkedList {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteMiddle(ListNode head){
        //create ListNode to point to the node before the head as placeholder for middle node
        ListNode temp = new ListNode(0, head);
        //initialize a pointer for a counter that reaches the end at the head of the list
        //and a pointer that is behind end pointer to mark the middle node at the node before head
        ListNode middleNode = temp, endNode = head;
        //while loop that if endNode and next endNode value is not null
        while(endNode != null && endNode.next != null){
            //then move endNode up 2 indices and middleNode up 1
            middleNode = middleNode.next;
            endNode = endNode.next.next;
        }
        //delete middle node by setting it equal to the .next.next value
        middleNode.next = middleNode.next.next;
        //return the head
        return temp.next;
    }
}
