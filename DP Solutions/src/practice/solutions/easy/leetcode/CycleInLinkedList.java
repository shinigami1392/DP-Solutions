package practice.solutions.easy.leetcode;

public class CycleInLinkedList {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slowRunner = head;
        ListNode fastRunner = head.next;
        while (slowRunner.next != null && (fastRunner!=null && fastRunner.next !=null && fastRunner.next.next!=null)){
            if (slowRunner == fastRunner){
                return true;
            }
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        return false;
    }

}
