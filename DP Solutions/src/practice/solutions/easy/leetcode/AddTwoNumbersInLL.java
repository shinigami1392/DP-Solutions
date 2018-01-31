package practice.solutions.easy.leetcode;

public class AddTwoNumbersInLL {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol = new ListNode(0);
        ListNode start = new ListNode(0);
        start = sol;
        int carry = 0;
        int temp;
        while(l1 != null || l2 != null)
        {
            if(l1 == null)
            {
                temp = l2.val + carry;
                carry = 0;
                l2 = l2.next;
            }
            else if(l2 == null)
            {
                temp = l1.val + carry;
                carry = 0;
                l1 = l1.next;
            }
            else
            {
                temp = l1.val + l2.val + carry;
                carry = 0;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (temp >=10){
                carry = temp/10;
                temp= temp%10;
            }
            //sol.next = null;
            System.out.println(temp);
            sol.val = temp;
            
            if(l1 != null || l2 != null || carry > 0){
            sol.next = new ListNode(0);
            }
            sol = sol.next;
    }
        if(carry > 0){
            sol.val = carry;
        }
    return start;
    }
}
