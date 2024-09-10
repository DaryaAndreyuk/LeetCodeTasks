package easy.twoPointers;

import java.util.Hashtable;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode n3 = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n0 = new ListNode(0);
		ListNode n_4 = new ListNode(-4);
		n3.next = n2;
		n2.next = n0;
		n0.next = n_4;
		n_4.next = n2;
		int pos  = 1;
		// 3 2 0 -4 pos = 1
		System.out.println(hasCycle(n3));

	}

		public static boolean hasCycle(ListNode head) {
	        if (head == null || head.next == null) {
	            return false; // No cycle if list is empty or has only one node
	        }

	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;        // Move slow by 1 step
	            fast = fast.next.next;   // Move fast by 2 steps

	            if (slow == fast) {      // If they meet, there is a cycle
	                return true;
	            }
	        }

	        return false;  // No cycle
	    }

	}



class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
