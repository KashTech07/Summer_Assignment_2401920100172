class Solution {
    public ListNode deleteMiddle(ListNode head) {
    if(head==null||head.next==null) return null ;
   ListNode temp = head ;
   ListNode slow = head ;
   ListNode fast = head ;
   ListNode prev = null ;
   while(fast!=null && fast.next!=null ){
    fast = fast.next.next ;
    prev = slow ;
    slow = slow.next ;
   }
   prev.next = prev.next.next ;
   return head ;}}
