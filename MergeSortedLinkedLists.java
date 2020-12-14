//Merge two sorted linked lists and return it as a new sorted list.
//The new list should be made by splicing together the nodes of the first two lists.
//Examples:
//        Input: l1 = [1,2,4], l2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//
//        Input: l1 = [], l2 = [0]
//        Output: [0]



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


public class MergeSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head=l2;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                break;
            }

            if(l1.val>=l2.val)
            {
                if(l2.next!=null)
                {
                    if(l1.val<=l2.next.val)
                    {
                        insertAfter(l1,l2);
                        l1=l1.next;
                    }
                }
                else
                {
                    insertAfter(l1,l2);
                }
            }
            if(l2.next==null)
            {
                l2.next=l1;
                break;
            }
            l2=l2.next;
        }

        Runner.printLinkedList(head);
        return head;

    }

    private void insertAfter(ListNode n,ListNode toInsert)
    {
        if(n.next==null)
        {
            n.next=toInsert;
            return;
        }
        else
        {
            toInsert.next=n.next;
            n.next=toInsert;
        }

    }

}
