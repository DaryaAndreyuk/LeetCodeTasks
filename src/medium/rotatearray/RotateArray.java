package medium.rotatearray;

public class RotateArray {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    // 1 2 3 4 5 6 7
    // 7 6 5 4 3 2 1
    // output: [5,6,7,1,2,3,4]

    int[] output = rotateArray(nums, k);
    printArray(output);

  }

  private static void printArray(int[] output) {
    for (int i = 0; i < output.length; i++)
      System.out.print(output[i] + " ");
  }

  private static int[] rotateArray(int[] nums, int k) {
    int length = nums.length;
    for (int i = 0; i < length - k; i++) {
      int a = nums[i];
      nums[i] = nums[length - i - 1];
      nums[length - i - 1] = a;
    }
    // 7 6 5 4 3 2 1 
    //for ()

    return nums;

  }

}