package medium.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedListWeightedSum {

	public static void main(String[] args) {
		List<Object> nestedList = new ArrayList<Object>();
		nestedList.add(1);
		nestedList.add(Arrays.asList(2, 2));
		Integer depth = 1;
		int resultSum = countSum(nestedList, depth);
		System.out.println(resultSum);
	}

	public static int countSum(List<Object> input, Integer depth) {
		int resultSum = 0;
		for (Object element : input) {
			if (element instanceof Integer) {
				resultSum += (Integer) element * depth;
			}
			if (element instanceof List) {
				resultSum += countSum((List<Object>) element, depth + 1);
			}
		}
		return resultSum;
	}
}
