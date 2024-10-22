package easy.plusone;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {4,3,2,9 };
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
		        return digits;  // Сразу возвращаем результат, если нет переноса
		    }
		    digits[i] = 0;  // Если цифра была 9, то ставим 0 и идем к старшему разряду
		}

		// Если мы дошли до конца массива (например, для 999), создаем новый массив
		int[] output = new int[digits.length + 1];
		output[0] = 1;
		return output;
	}

}
