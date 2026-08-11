class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode temp = head.next;
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;            
        }
        return prev;
    }
}
