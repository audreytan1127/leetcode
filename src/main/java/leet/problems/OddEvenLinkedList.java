package leet.problems;

public class OddEvenLinkedList {
    private class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddToEvenList(ListNode head){
        //if the head is null, return null
        if(head == null){
            return null;
        }
        //initialize the pointers
        //initialize odd pointer to the head
        ListNode odd = head;
        //initialize even pointer to head.next
        ListNode even = head.next;
        //initialize evenList pointer to even
        ListNode evenList = even;
        //while even and its neighbor are not null
        while(even != null && even.next != null){
            //set the value of the next odd to the neighbor of the even value
            odd.next = even.next;
            //move the odd pointer
            odd = odd.next;
            //set value of next even to the neighbor of the odd value
            even.next = odd.next;
            //move even pointer
            even = even.next;
        }
        //when loop is finished reordering the odd values, set the end to evenList to print all even values
        odd.next = evenList;
        //return the reordered list
        return head;
    }
}
