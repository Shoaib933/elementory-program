package lovebabbar.chararaysstring;
/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.
1:51-love babbar
 */
public class PalindromicSUbStringLT647 {

    static void main() {
        String s = "abc";
        int totalCount = 0;
        for (int center = 0; center < s.length(); center++) {
            int oddKaCount = expandAroundIndex(center, center, s);
            totalCount += oddKaCount;

            int evenKaCount = expandAroundIndex(center, center +1, s);
            totalCount += evenKaCount;
        }

        IO.println("Total count : "+totalCount);
    }
    static int expandAroundIndex(int left, int right, String s) {
        int count = 0;
        while (left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; left--; right++;
        }
        return count;
    }
}
