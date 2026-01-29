package lovebabbar.arrays.assignment;
/*
917. Reverse Only Letters
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
 */
/*
------------------------------------
 */
/*
345. Reverse Vowels of a String
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseOnlyLettersLT917 {
    static void main() {
        String str = "Qedo1ct-eeLg=ntse-T!";
        char[] ch = str.toCharArray();

        int i=0;
        int j = str.length()-1;
        while(i <= j) {
            if (Character.isLetter(ch[i]) && Character.isLetter(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++; j--;
            } else if (!Character.isLetter(ch[i])) {
                i++;
            } else {
                j--;
            }
        }
        IO.println("Org : "+str);
        IO.println("rev : "+new String(ch));
    }


}
