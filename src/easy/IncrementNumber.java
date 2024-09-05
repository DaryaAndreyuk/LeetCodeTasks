package easy;

public class IncrementNumber {

	public static void main(String[] args) {
		int[] input = { 1, 9, 3, 9 };
		int[] output = incrementNumber(input);
		for (int i : output)
			System.out.print(i + " ");
	}

	public static int[] incrementNumber(int[] input) {
		int pointer = input.length - 1;
		for (int i = pointer; i >= 0; i--) {
			if (input[i] == 9 && i == 0) {
				int[] output = new int[input.length + 1];
				output[i] = 1;
				return output;
			} else if (input[i] == 9 && i != 0) {
				input[i] = 0;
			} else {
				input[i] += 1;
				break;
			}
		}
		return input;
	}
}
