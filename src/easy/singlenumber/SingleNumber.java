package easy.singlenumber;

public class SingleNumber {

	 public static void main(String[] args) {
	        int[] nums = { 1, 2, 1 };
	        int single = findSingleNumber(nums);
	        System.out.println(single);
	    }

	    private static int findSingleNumber(int[] nums) {
	        int result = 0;
	        for (int num : nums) {
	            result ^= num;
	        }
	        return result;
	    }
}
