package easy.removeduplicates;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] expectedNums = { 0, 1, 2, 3, 4 };

        int k = removeDuplicates(nums);

        assert k == expectedNums.length : "Length mismatch";
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "Element mismatch at index " + i;
        }
        printNums(nums, k);
    }

    private static void printNums(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex++] = nums[i];
            }
        }
        return uniqueIndex;
    }
}
