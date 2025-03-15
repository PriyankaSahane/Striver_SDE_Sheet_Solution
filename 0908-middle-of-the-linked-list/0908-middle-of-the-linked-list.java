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
class Solution {

    public static int listSize(ListNode head){
        if(head==null || head.next==null){
            return 0;
        }

            int len=0;
            while(head != null){
                len++;
                head=head.next;
                
            }

        
        return len;
    }


    public ListNode middleNode(ListNode head) {
        int length= listSize(head);
        if(length==0){
            return head;
        }
        
        ListNode temp = head;
        int midPosition= length/2;

        while(midPosition >0){
            temp=temp.next;
            midPosition--;
        }
        
        return temp;
    }
        

       /* while(temp != null){
            count++;
            temp=temp.next;

        }

        int mid=count/2;
        temp=head;

        while(temp != null){
            mid=mid-1;
            if(mid==0){
                break;
            }
            temp=temp.next;
        }
        return temp;
        
    }*/
}