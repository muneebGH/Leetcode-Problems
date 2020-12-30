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
