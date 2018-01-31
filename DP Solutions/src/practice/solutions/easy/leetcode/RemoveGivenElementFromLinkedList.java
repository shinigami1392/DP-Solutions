package practice.solutions.easy.leetcode;

public class RemoveGivenElementFromLinkedList {
	
	public static void main(String[] args) {
		RemoveGivenElementFromLinkedList rl = new RemoveGivenElementFromLinkedList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		int x = 'a';
		System.out.println(x);
		ListNode sol = rl.removeElements(head, 6);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public ListNode removeElements(ListNode head, int val) {
		ListNode tempHead = head;
        while(tempHead.val == val){
        	tempHead = tempHead.next;
        }
        ListNode originalHead = tempHead;
        ListNode prev = tempHead;
        tempHead = tempHead.next;
        while(tempHead!=null){
            if(tempHead.val == val){
            	prev.next = tempHead.next;
            }
            tempHead = tempHead.next;
        }
        return originalHead;
    }

}
