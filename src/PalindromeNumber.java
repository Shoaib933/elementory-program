public class PalindromeNumber {
    static void main() {
        int n = 121;
        int orig = n;
        int rev = 0;
        // % gives last digit & / gives remaining digit
        while(n>0) {
            int temp = n%10;
            rev = rev*10+temp;
            n = n/10;
        }
        if(orig == rev)
            System.out.println(orig+ " : is Plandrom");
        if (orig!=rev)
            System.out.println(orig+ " : is NOT Plandrom");
    }
}
/*
public class Main {

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(123));  // false
    }
}
 */




// -------------------------------

/*
public class Main {
    public static void main(String[] args) {
        int num = 121;

        String s = String.valueOf(num);
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}

 */
