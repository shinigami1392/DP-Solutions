package practice.solutions.easy.leetcode;

public class MergeSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode iter = newHead;
        
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                iter.val = l1.val;
                l1 = l1.next;
            }
            else if(l1.val > l2.val){
                iter.val = l2.val;
                l2 = l2.next;
            }
            else{
                iter.val = l2.val;
                iter.next = new ListNode(0);
                iter = iter.next;
                iter.val = l1.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(l1 != null || l2 != null){
                iter.next = new ListNode(0);
                iter = iter.next;
            }
            
        }
        if(l1!=null){
            iter.val = l1.val;
            iter.next = l1.next;
            }
        else if(l2!=null){
            iter.val = l2.val;
            iter.next = l2.next;
            }
        return newHead;
    }
}
