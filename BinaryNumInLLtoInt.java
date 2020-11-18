//Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
//Return the decimal value of the number in the linked list.
//Example:
//        Input: head = [1,0,1]
//        Output: 5
//        Explanation: (101) in base 2 = (5) in base 10
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class BinaryNumInLLtoInt {
    public static int getDecimalValue(ListNode head) {
        String num="";
        while(head!=null)
        {
            num=num.concat(String.valueOf(head.val));
            head=head.next;
        }

        return Integer.parseInt(num,2);
    }
}
