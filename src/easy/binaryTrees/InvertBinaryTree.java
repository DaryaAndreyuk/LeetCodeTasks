package easy.binaryTrees;

//Given the root of a binary tree, invert the tree, and return its root.
// root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]

public class InvertBinaryTree {

	public static void main(String[] args) {
		int[] input = { 4, 2, 7, 1, 3, 6, 9 }; // Output: [4,7,2,9,6,3,1]
		int[] input1 = { 2, 1, 3 }; // Output: [2,3,1]
		int[] input2 = {}; // Output: []

		// Example tree: [4,2,7,1,3,6,9]
		TreeNode root = new TreeNode(input[0]);
		root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

		TreeNode invertedRoot = invertTree(root);

		printTree(invertedRoot);
		// printTree(invertTree(root1));
		// printTree(invertTree(root2));
	}

	private static void printTree(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " ");
			printTree(root.left);
			printTree(root.right);
		}
	}

	private static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		// Recursively invert the left and right subtrees
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);

		// Swap the left and right children
		root.left = right;
		root.right = left;

		return root;
	}
}
