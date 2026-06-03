class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1) ;
        ListNode prev = dummy;
        ListNode curr = head ;
        while(curr!=null){
           if(prev==dummy||prev.val!=curr.val){
            prev.next = curr ;
            prev = curr ;
           }
          
            curr = curr.next ;
           
        }
        prev.next = null ;
        return dummy.next ;
    }
}
