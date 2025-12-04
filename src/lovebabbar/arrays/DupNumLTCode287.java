

public class DupNumLTCode287 {
    static int findDup(int[] dup) {

        while(dup[0] != dup[dup[0]]) {
            int temp = dup[dup[0]];
            dup[dup[0]] = dup[0];
            dup[0] = temp;

        }
        return dup[0];

    }

}

static void main() {
    int n = DupNumLTCode287.findDup(new int[]{1,3,4,2,2});
    System.out.println("Dup : "+n);
}
//Another approach -ve marking