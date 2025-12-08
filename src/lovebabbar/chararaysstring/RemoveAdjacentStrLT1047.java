



static void main() {
    String str = "abbaca";
    String str1 = "abbaca";
    IO.println("Original String "+str);
    IO.println("After removing : "+remvAdjcntStr(str));
    IO.println("LEETCode 1047. Remove All Adjacent Duplicates In String");
    IO.println(remvAllAdjcntStrLTCODE(str1));
}

static String remvAdjcntStr(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i =0; i<str.length(); i++) {
        if(!sb.isEmpty() && str.charAt(i)!= str.charAt(sb.length()-1)) {
            sb.append(str.charAt(i));
        } else if (sb.isEmpty()) {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

static String remvAllAdjcntStrLTCODE(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i =0; i<str.length(); i++) {
        if (!sb.isEmpty() ) {
            if(str.charAt(i) == sb.charAt(sb.length()-1)) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(str.charAt(i));
            }
        }
         else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
/*
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(ans.length() >0) {
                if (ans.charAt(ans.length()-1) == s.charAt(i)) {
                    ans.deleteCharAt(ans.length()-1);
                }
                else {
                    ans.append(s.charAt(i));
                }
            }
            else {
                ans.append(s.charAt(i));
            }

        }
        return ans.toString();
    }

}

 */
