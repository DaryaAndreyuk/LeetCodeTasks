package medium.rotatearray;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		// 1 2 3 4 5 6 7
		// 7 6 5 4 3 2 1
		// output: [5,6,7,1,2,3,4]

		rotate(nums, k);
		printArray(nums);

		int[] nums1 = { 1, 2, 3 };
		int k1 = 1;

		rotate(nums1, k1);
		printArray(nums1);

	}

	private static void printArray(int[] output) {
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");
		System.out.println();
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - k - 1);
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n - 1);
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}