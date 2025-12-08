package lovebabbar.chararaysstring;

class CharConversion {

    static String charConv(String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
        /*
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32); // upper → lower
            }
            else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32); // lower → upper
            }

         */
            ch[i] = Character.isUpperCase(ch[i]) ? Character.toLowerCase(ch[i])
                    : Character.toUpperCase(ch[i]);
        }


        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "ShOaIb";
        System.out.println("Original String : " + str);
        System.out.println("After Conversions : " + charConv(str));
    }
}/*
ch[i] = Character.isUpperCase(ch[i]) ? Character.toLowerCase(ch[i])
                                     : Character.toUpperCase(ch[i]);
*/
