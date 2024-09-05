package easy.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalRecursive {

	public static void main(String[] args) {
		Integer[] input = { 1, null, 2, 3 };
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node2 = new TreeNode(2, node3, null);
		TreeNode root = new TreeNode(1, null, node2);
		List<Integer> outputList = prepareListForPreorderTraversal(root); //expected: [1, 2, 3]
		System.out.println(outputList);
	}

	public static List<Integer> prepareListForPreorderTraversal(TreeNode root) {
		List<Integer> outputList = new ArrayList<>();
		preorderTraversal(root, outputList);
		return outputList;
	}

	private static void preorderTraversal(TreeNode root, List<Integer> outputList) {
		if (root == null)
			return;
		outputList.add(root.val);
		preorderTraversal(root.left, outputList);
		preorderTraversal(root.right, outputList);
	}
}
