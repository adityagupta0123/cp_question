class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode root = new ListNode(-1);
         root.next = head;
         ListNode fast = root;
         ListNode slow = root;
    
        for(int i=0;i<n;i++){
          fast = fast.next;
        }
        while(fast.next!= null){
          slow = slow.next;
          fast = fast.next;
        
        }
       slow.next =   slow.next.next;
       return root.next;
    }
}
  
