

public class PlaindromeString {

    static boolean checkPalindromeWord(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length()-1;
        while( i<=j ) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }

    static boolean checkPalindromeScentence(String str) {
        String[] split = str.split(" ");
        int i =0; int j = split.length-1;
        while (i<=j) {
            if (!(split[i].equalsIgnoreCase(split[j])))
                return false;
            i++; j--;
        }
        return true;
    }
}

static void main() {
    String sent = "How AND and How";
    String s = "racecare";
    System.out.println("Original String : "+s);
    System.out.println(s+ " : Is Palindrome : "+PlaindromeString.checkPalindromeWord(s));

    System.out.println(sent + " : Is plaindrome : "+PlaindromeString.checkPalindromeScentence(sent));
}
