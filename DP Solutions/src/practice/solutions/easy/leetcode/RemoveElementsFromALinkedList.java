package practice.solutions.easy.leetcode;

public class RemoveElementsFromALinkedList {
    public ListNode removeElements(ListNode head, int val) {
        ListNode n = head;
        while(n!= null){
            if(n.next.val == val){
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

        RemoveElementsFromALinkedList cl = new RemoveElementsFromALinkedList();
        cl.traverse(head);
        cl.removeElements(head, 6);
        System.out.println("===");
        cl.traverse(head);
    }
}
