package easy;

/*public class MoveZeroes1 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		int[] nums1 = { 0, 0, 1};
		int[] output = moveZeroes(nums1);
		for (int num : output)
			System.out.println(num + " ");

	}

	public static int[] moveZeroes(int[] nums) {
		int[] output = new int[nums.length];
		int length = nums.length - 1;
		int numsOfZero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				output[length - numsOfZero] = 0;
				numsOfZero++;
			} else {
				output[i - numsOfZero] = nums[i];
			}
		}
		return output;
	}
}*/


public class MoveZeroes1 {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill the remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}