package easy.plusone;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 0 };
		int[] output = { 4, 3, 3, 0 };

		int[] output_actual = plusOne(digits);
		printArray(output_actual);

	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	private static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				break;
			} else if (i != 0) {
				digits[i] = 0;
			} else if (i == 0) {
				int[] output = new int [digits.length + 1];
				if (digits[i] < 9)
					output[0]  = digits[i]+1;
				else 
					output[0] = 1;
				return output;
			}

		}
		return digits;
	}

}
