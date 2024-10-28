package basic;

public class UtilClass {
	public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

	public static void printArray(String[] strings) {
		for (String element : strings) {
            System.out.print(element + " ");
        }
        System.out.println();		
	}

}
