class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode h3 = dummy;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                h3.next = t1;
                t1 = t1.next;
            }
            else if(t1.val > t2.val){
                h3.next = t2;
                t2 = t2.next;
            }
            h3 = h3.next;
        }

        if(t1 != null) {
            h3.next = t1;
        } else {
            h3.next = t2;
        }

        return dummy.next;
    }
}