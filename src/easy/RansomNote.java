package easy;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "babb";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Count the occurrences of each character in the magazine
		for (char c : magazine.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Check if ransomNote can be constructed
		for (char c : ransomNote.toCharArray()) {
			if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
				return false; // Not enough characters in magazine
			}
			charCountMap.put(c, charCountMap.get(c) - 1); // Use one occurrence of this character
		}

		return true;
	}

}
