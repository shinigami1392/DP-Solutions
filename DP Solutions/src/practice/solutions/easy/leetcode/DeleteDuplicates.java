package practice.solutions.easy.leetcode;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {

        boolean sameFlag = false;
        ListNode n = head;
        while(n!=null){
            if(n.next == null){
                break;
            }
            if (n.val == n.next.val){
                n.next = n.next.next;
            }
            n = n.next;
        }
        return head;
    }

    void traverse(ListNode head){
        ListNode n = head;
        while(n!=null){
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(6);

        head.next = n2;
        n2.next= n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        DeleteDuplicates cl = new DeleteDuplicates();
        cl.traverse(head);
        cl.deleteDuplicates(head);
        System.out.println("===");
        cl.traverse(head);
    }
}
