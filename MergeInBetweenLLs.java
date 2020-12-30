//You are given two linked lists: list1 and list2 of sizes n and m respectively.
//Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
//The blue edges and nodes in the following figure incidate the
//Example:
//        Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
//        Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
//        Explanation: The blue edges and nodes in the above figure indicate the result.
public class MergeInBetweenLLs {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = null;
        ListNode temp = list1;
        int endPointLoopCount = b - a;
        //point to start node
        while (a >= 1) {
            if (a == 1) {
                start = temp;
            }
            a--;
            temp = temp.next;
        }
        //point end to removal end
        temp = start;
        for (int i = 0; i < endPointLoopCount + 2; i++) {
            temp=temp.next;
        }
        end=temp;
        //insert head of list2 in list1 start
        start.next=list2;
        //add end node to tail of list 2
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=end;
        return list1;
    }
}
