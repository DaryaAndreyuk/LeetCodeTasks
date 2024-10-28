package easy.validsudoku;

import java.util.HashSet;
import java.util.Set;

import basic.UtilClass;

public class ValidSudoku {

	public static void main(String[] args) {
		String[][] board = 
				{{"5","3",".",".","7",".",".",".","."},
				{"6",".",".","1","9","5",".",".","."},
				{".","9","8",".",".",".",".","6","."},
				{"8",".",".",".","6",".",".",".","3"},
				{"4",".",".","8",".","3",".",".","1"},
				{"7",".",".",".","2",".",".",".","6"},
				{".","6",".",".",".",".","2","8","."},
				{".",".",".","4","1","9",".",".","5"},
				{".",".",".",".","8",".",".","7","9"}};
		
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(String[][] board) {
		//check rows
		System.out.println("rows:");
		boolean isValid = true;
		for (String[] row : board) {
			if (isValid) {
			isValid &= validSudokuInArray(row);
			} else {
				return isValid;
			}
		}
		System.out.println(isValid);
		
		//check columns
		System.out.println("columns:");
		String[] column = new String[board[0].length];
		int i = 0;
		int j = 0;
		while (j < board[0].length) {
			for (String[] row : board) {
				column[i] = row[j];
				i++;
			}
			isValid &= validSudokuInArray(column);
			j++;
			i = 0;
		}

		return isValid;
	}

	private static boolean validSudokuInArray(String[] row) {
		Set<String> set = new HashSet<String>();
		int rowSize = 0;
		for (String s : row) {
			if (s.matches("[1-9]")) {
				rowSize++;
				set.add(s);
			}
		}
		int setSize = set.size();
		return setSize == rowSize;
	}

}
