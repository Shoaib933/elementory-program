

public static class SpaceRepWithSym {

    static String replaceSpaces(String str) {
        char[] ch = str.toCharArray();

        for (int i =0; i<=str.length()-1; i++) {
            if (str.charAt(i)== ' ') {
                ch[i] = '@';
            }
        }
        return new String(ch);
    }
}

static void main() {
    String org = "Hi Shoaib How Are You";
    System.out.println("Original String : "+org);
    System.out.println("After Replacing : "+SpaceRepWithSym.replaceSpaces(org));
}
