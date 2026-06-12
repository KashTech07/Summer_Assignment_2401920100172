class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1) ;
        ListNode even = dummy1 ;
        ListNode dummy2 = new ListNode(-1) ;
        ListNode odd = dummy2 ;
        ListNode curr = head ;
        int count = 1 ;
        while(curr!=null){
            if(count%2==0){
                even.next = curr ;
                even = curr ;
            }
            else{
                odd.next = curr ;
                odd = curr ;
            }
            curr = curr.next ;
            count++ ;
        }
        odd.next = dummy1.next ;
        even.next = null ;
        return dummy2.next ;}}
