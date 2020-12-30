//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//If there are two middle nodes, return the second middle node.
//Example:
//        Input: [1,2,3,4,5]
//        Output: Node 3 from this list (Serialization: [3,4,5])
//        The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
//        Note that we returned a ListNode object ans, such that:
//        ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.

public class MiddleNodeOfLL {
    public static ListNode solution(ListNode head){
        //calculate length of linked list
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        //calculate middle point
        int middle= length/2;
        middle++;
        //return middle
        temp=head;
        while(middle>=1){
            if(middle==1){
                return temp;
            }
            middle-=1;
            temp=temp.next;
        }
        return temp;
    }

}
