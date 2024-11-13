package easy.reverseString;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] out = {'o', 'l', 'l', 'e', 'h'};
        reverseString(s);
        for (char c : s)
            System.out.print(c + " ");
    }


    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }

    }

}
