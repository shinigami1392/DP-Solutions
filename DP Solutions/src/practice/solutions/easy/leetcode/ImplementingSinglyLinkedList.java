package practice.solutions.easy.leetcode;

public class ImplementingSinglyLinkedList {
    void appendToTail(int data, ListNode head){
        ListNode end = new ListNode(data);
        ListNode n = head;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void traverse(ListNode head){
        ListNode n = head;
        while(n!=null){
            System.out.println(n.val);
            n = n.next;
        }
    }

    void insertInTheMiddle(int data, int prev, ListNode head){
        ListNode n = head;
        ListNode curr = new ListNode(data);
        while(n.val!=prev && n!=null){
            n = n.next;
        }
        if(n==null){
            System.out.println("Insertion failed!");
        }
        else {
            curr.next = n.next;
            n.next = curr;
        }
    }

    ListNode insertAtTheBeginning(ListNode head, int data){
        ListNode newHead = new ListNode(data);
        if (head != null){
            newHead.next=head;
            head = newHead;
            return newHead;
        }
        return head;

    }
    
    void removeFromEnd(ListNode head){
        ListNode n = head;
        ListNode prev = head;
        while (n.next != null){
            prev = n;
            n = n.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        head.next = n2;
        ImplementingSinglyLinkedList isl = new ImplementingSinglyLinkedList();
        isl.traverse(head);
        System.out.println("===");
        isl.appendToTail(3, head);
        isl.traverse(head);
        System.out.println("===");
        isl.insertInTheMiddle(5,3,head);
        isl.traverse(head);
        System.out.println("===");
        head = isl.insertAtTheBeginning(head,9);
        isl.traverse(head);
        System.out.println("===");
        isl.removeFromEnd(head);
        isl.traverse(head);
        System.out.println("===");
    }
}
