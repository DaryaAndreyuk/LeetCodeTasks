package easy;

public class IntersectionThreeSortedArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5 };
		int[] b = { 3, 3, 4 };
		int[] c = { 2, 3, 4, 5, 6 };

		int element = findCommonElement(a, b, c);
		if (element != -1) {
			System.out.println("Common element found: " + element);
		} else {
			System.out.println("No common element found.");
		}
	}

	private static int findCommonElement(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) {
				return a[i];
			}
			if (a[i] < b[j]) {
				i++;
			} else if (b[j] < c[k]) {
				j++;
			} else {
				k++;
			}
		}
		return -1;
	}

}
