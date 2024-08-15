package easy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
	public static void main(String[] args) {
		Integer[] nums = { 2, 2, 3, 3, 3,1 ,1,1,1 ,1, 1};
		System.out.println(majorityElement1(nums));

	}

	//Solution 1
	public static int majorityElement(Integer[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int minFreq = nums.length / 2;
		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				int oldValue = map.get(num);
				map.replace(num, oldValue + 1);
			}
		}
		System.out.println(map);
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			Integer freq = entry.getValue();
			if (freq > minFreq)
				return entry.getKey();
		}
		return 0;
	}

	//Solution 2
	public static int majorityElement1(Integer[] nums) {
		Collections.sort(Arrays.asList(nums));
		System.out.println(Arrays.asList(nums));
		return nums[nums.length / 2];
	}

}
