

public static class RemoveSpace {

    static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) != ' ')
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

static void main() {
    String org = "Hi Shoaib How Are You";
    System.out.println("Original String : "+org);
    System.out.println("After Replacing : "+ RemoveSpace.removeSpaces(org));
}
