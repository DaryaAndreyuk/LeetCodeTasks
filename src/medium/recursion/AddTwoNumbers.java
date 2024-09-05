package medium.recursion;

public class AddTwoNumbers {
	/*
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order, and each of their nodes
	 * contains a single digit. Add the two numbers and return the sum as a linked
	 * list. You may assume the two numbers do not contain any leading zero, except
	 * the number 0 itself. Example 1: Input: l1 = [2,4,3], l2 = [5,6,4] Output:
	 * [7,0,8] Explanation: 342 + 465 = 807. Example 2: Input: l1 = [0], l2 = [0]
	 * Output: [0] Example 3: Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output:
	 * [8,9,9,9,0,0,0,1] 4 -> 3 5 -> 6 -> 4 7 -> 0 -> 8
	 */

	public static void main(String[] args) {
		ListNode ln3 = new ListNode(3);
		ListNode ln4_4 = new ListNode(4, ln3);
		ListNode listNode1 = new ListNode(2, ln4_4);

		ListNode ln4 = new ListNode(4);
		ListNode ln6 = new ListNode(6, ln4);
		ListNode listNode2 = new ListNode(5, ln6);

		ListNode sumList = addTwoNumbers(listNode1, listNode2);
		printNode(sumList);

	}

	private static void printNode(ListNode sumList) {
		if (sumList == null) return;
		System.out.print(sumList.val + " ");
		printNode(sumList.next);
	}

	private static ListNode addTwoNumbers(ListNode ln1, ListNode ln2) {
		return addTwoNumbers(ln1, ln2, 0); // Start with carry = 0
	}

	private static ListNode addTwoNumbers(ListNode ln1, ListNode ln2, int carry) {
		if (ln1 == null && ln2 == null && carry == 0) {
			return null;
		}

		int sum = carry;
		if (ln1 != null) sum += ln1.val;
		if (ln2 != null) sum += ln2.val;

		ListNode resultSum = new ListNode(sum % 10);
		resultSum.next = addTwoNumbers(ln1 != null ? ln1.next : null, 
				ln2 != null ? ln2.next : null, sum >= 10 ? 1 : 0);
		return resultSum;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
