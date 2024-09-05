package easy.binaryTrees;

import java.util.ArrayList;
import java.util.List;
/*
 * Input: root = [1,null,2,3]

Output: [1,3,2]

 * Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]


Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]
 */

public class InorderTraversal {

	public static void main(String[] args) {
		Integer[] input = { 1, null, 2, 3 };

		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node2 = new TreeNode(2, node3, null);
		TreeNode root = new TreeNode(1, null, node2);

		List<Integer> output = prepareListForInorderTraversal(root); // {1,3,2} output
		System.out.println(output);
	}

	public static List<Integer> prepareListForInorderTraversal(TreeNode root) {
		List<Integer> outputList = new ArrayList<>();
		inorderTraversal(root, outputList);
		return outputList;
	}

	private static void inorderTraversal(TreeNode root, List<Integer> output) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left, output);
		output.add(root.val);
		inorderTraversal(root.right, output);
	}
}