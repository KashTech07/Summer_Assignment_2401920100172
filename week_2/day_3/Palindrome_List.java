class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode second = reverse(slow) ;
        ListNode s = second ;
        ListNode temp = head ;
        while(s!=null)
{
    if(s.val!=temp.val) return false ;
    s = s.next ;
    temp = temp.next ;
}  
      return true ;      
    }
    static ListNode reverse(ListNode head){
        ListNode curr = head ;
        ListNode next = null ;
        ListNode prev = null  ;
        while(curr!=null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
}
