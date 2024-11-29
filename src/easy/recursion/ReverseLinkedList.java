package easy.recursion;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode n4 = new ListNode(4, null);
		ListNode n3 = new ListNode(3, n4);
		ListNode head = new ListNode(1, n3);
		printList(reverseList(head));
	}

	private static void printList(ListNode list) {
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
		System.out.println();
	}

	public static ListNode reverseList(ListNode head) {

		// 1 -> 3 -> 4 => 4 -> 3 -> 1
		// 4.next = null => 1.next = null
		// 3.next = 4 => 4.next = 3
		// 1.next = 3 => 3.next = 1

		// node1 node2
		// node1.next = node2

		// head.next = node1
		// head.next.next = node2
		// node1.next = head;
		// node2.next = node1;

		// head.next = null;

		// 4 -> 3 -> 1
		// 1.next = null
		// 3.next = 1
		// 4.next = 3
		if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode reversedListHead = reverseList(head.next);

        // Adjust the pointers
        head.next.next = head;
        head.next = null;

        // Return the new head of the reversed list
        return reversedListHead;
	}
}
