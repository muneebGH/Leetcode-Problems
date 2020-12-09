//Reverse a singly linked list.
//Example:
//        Input: 1->2->3->4->5->NULL
//        Output: 5->4->3->2->1->NULL
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {
    public ListNode reverseListIterative(ListNode head) {
        if(head==null || head.next==null)
        {
            return  head;
        }

        ListNode king=head.next;
        ListNode saved=head;
        saved.next=null;
        while(king.next!=null)
        {

            ListNode temp=king.next;
            king.next=saved;
            saved=king;
            king=temp;
        }

        king.next=saved;
        return king;

    }

    public ListNode reverseListRecursive(ListNode head) {

        if(head==null||head.next==null)
        {
            return head;
        }

        ListNode main=reverseListRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return main;
    }


    // private void printList(ListNode head)
    // {
    //     while(head!=null)
    //     {
    //         System.out.print(head.val+" - >");
    //         head=head.next;
    //     }
    // }


}
