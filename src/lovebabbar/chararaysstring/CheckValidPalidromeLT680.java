package lovebabbar.chararaysstring;
/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 */
public class CheckValidPalidromeLT680 {

    static void main() {
        String s= "abca";
        boolean ans = validPalindrome(s);
        if (ans)
            IO.println(s+ " is palindrome after removing one char");
        else
            IO.println(s+ " is NOT palindrome after removing one char");

    }

    private static boolean validPalindrome(String s) {
        int i=0; int j = s.length()-1;

        while (i<=j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(i + 1, j, s) || isPalindrome( i, j - 1, s);
            } else {
                i++; j--;
            }
        }


        return true;
    }

    private static boolean isPalindrome(int i, int j, String s) {
        while (i<=j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++; j--;
            }
        }
        return true;
    }
}
