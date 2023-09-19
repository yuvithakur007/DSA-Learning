class palindromeLL{
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head.next;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.val!= fast.val)
            return false;
        slow = head;
        fast = slow.next;
        while(slow!= fast){
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    
    }
    public static void main(String[] args){
        
    }
}