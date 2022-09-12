
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
         
//         if(head == null || head.next == null){
//             return head;
//         }
        
//         ListNode newNode = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
        
//         return newNode;
    }
