

public class ReverseString {

    static String reverseStr(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length()-1;
        while( i<=j ) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
        return new String(ch);
    }
}

static void main() {
    String s = "ABCD";
    System.out.println("Original String : "+s);
    System.out.println("Reverse String : "+ReverseString.reverseStr(s));
}
