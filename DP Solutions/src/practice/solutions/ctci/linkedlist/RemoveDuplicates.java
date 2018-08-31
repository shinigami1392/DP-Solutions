package practice.solutions.ctci.linkedlist;

/**
 * @author pushkarladhe
 * CTCI: 2.1
 */

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(10);
		Node n3 = new Node(8);
		Node n4 = new Node(10);
		Node n5 = new Node(8);
		Node n6 = new Node(2);
		Node n7 = new Node(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		Node runner = n1;
		while(runner!=null) {
			System.out.println(runner.val);
			runner = runner.next;
		}
		
		runner = remooveDups(n1);
		System.out.println("====Function call====");
		while(runner!=null) {
			System.out.println(runner.val);
			runner = runner.next;
		}
		
	}
	
	public static Node remooveDups(Node start) {
		Node head = start;
		Node searchHead;
		
		while(head!=null) {
			searchHead = head;
			while(searchHead.next != null) {
				if (searchHead.next.val == head.val) {
					searchHead.next = searchHead.next.next;
				}
				searchHead = searchHead.next;
				if( searchHead == null) {
					break;
				}
			}
//			if(searchHead.val == head.val) {
//				searchHead = null;
//			}
			head = head.next;
		}
		return start;
	}
}
