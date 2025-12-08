import static java.lang.IO.*;

static String removeAllPArt(String str, String part) {
    StringBuilder sb = new StringBuilder(str);
    int index = sb.indexOf(part);

    while (index != -1) {
        sb.delete(index, index+part.length());
        index = sb.indexOf(part);
    }
    return sb.toString();
}

static void main() {
    String s = "daabcbaabcbc";
    String part = "abc";
    println("Original : "+s);
    println("After Removing : ");
    println(removeAllPArt(s, part));
    //o/p -> dab

}
