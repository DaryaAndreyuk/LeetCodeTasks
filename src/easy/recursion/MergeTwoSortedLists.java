package easy.recursion;

/*
 * Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode n4 = new ListNode(4, null);
		ListNode n3 = new ListNode(3, n4);
		ListNode list2 = new ListNode(1, n3);

		ListNode n4_1 = new ListNode(4, null);
		ListNode n2 = new ListNode(2, n4_1);
		ListNode list1 = new ListNode(1, n2);

		ListNode outputList = mergeTwoLists(list1, list2);
		printList(outputList);

	}

	private static void printList(ListNode outputList) {
		while (outputList != null) {
			System.out.print(outputList.val + " ");
			outputList = outputList.next;
		}
		System.out.println();
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
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