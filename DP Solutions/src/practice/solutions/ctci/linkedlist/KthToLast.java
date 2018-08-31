package practice.solutions.ctci.linkedlist;

/**
 * @author pushkarladhe
 * CTCI: 2.2
 */
public class KthToLast {
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(10);
		Node n3 = new Node(8);
		Node n4 = new Node(10);
		Node n5 = new Node(8);
		Node n6 = new Node(2);
		Node n7 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		System.out.println(kthToLast(n1, 1));
	}
	
	public static int kthToLast(Node start, int k) {
		Node fastRunner = start;
		Node slowRunner = start;
		
		while(fastRunner != null && k > 0) {
			fastRunner = fastRunner.next;
			k--;
		}
		
		while(fastRunner != null) {
			fastRunner = fastRunner.next;
			slowRunner = slowRunner.next;
		}
		return slowRunner.val;
	}
}
