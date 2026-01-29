package lovebabbar.arrays.assignment;

import java.util.HashMap;

/*
LT-242
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: fals
 */
public class CheckValidAnagramLT242 {
    static void main() {
        String s="anagram";
        String t="nagaram";
        boolean checkNamgramMethod1 = isAnagram(s, t);
        boolean checkNamgramMethod2 = isAnagram2(s, t);
        boolean checkNamgramMethod3 = isAnagram3(s, t);
        boolean checkNamgramMethod4 = isAnagram4(s, t);
        IO.println("Method_1 : "+checkNamgramMethod1);
        IO.println("Method_2 : "+checkNamgramMethod2);
        IO.println("Method_3 : "+checkNamgramMethod3);
        IO.println("Method_4 : "+checkNamgramMethod4);
    }

    private static boolean isAnagram4(String s, String t) {
        int[] count = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            int index1 = s.charAt(i) - 97;
            count[index1] = count[index1] +1;

            int index2 = t.charAt(i) - 97;
            count[index2] = count[index2] -1;

        }
        for (int val : count) {
            if (val!=0)
                return false;
        }
        return true;
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freqCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
           freqCount[s.charAt(i) - 'a']++;
           freqCount[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < freqCount.length; i++) {
            if (freqCount[i] != 0)
                return false;
        }
        return true;
    }
    private static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freqCount = new int[256] ;

        for (int i = 0; i < s.length(); i++) {
            freqCount[s.charAt(i)]++;
            freqCount[t.charAt(i)]--;
        }


        for (int i = 0; i < freqCount.length; i++) {
            if (freqCount[i] != 0)
                return false;
        }
        return true;
    }

    private static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> hm =  new HashMap<>();
        for (Character ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for (Character ct:t.toCharArray()) {
            if (!hm.containsKey(ct))
                return false;
            hm.put(ct, hm.get(ct)-1);
            if (hm.get(ct) == 0)
                hm.remove(ct);
        }

        return hm.isEmpty();

    }
}
