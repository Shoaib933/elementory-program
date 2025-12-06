

public class AddTwoArray {

    static String addTwoArray(int[] arr1, int[] arr2) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while ( i>=0 && j>=0) {
            int a = arr1[i] + arr2[j] + carry;
            int d = a%10;
            sb.insert(0, d);
            carry = a/10;
            i--; j--;
        }
        while (i>=0) {
            int a = (arr1[i]+carry);
            sb.insert(0, a%10);
            carry = a/10;
            i--;
        }
        while (j>=0) {
            int a = (arr1[j]+carry);
            sb.insert(0, a%10);
            carry = a/10;
            j--;
        }
        if (carry != 0)
            sb.insert(0, carry);

        return sb.toString();

    }
}

static void main() {
    String add = AddTwoArray.addTwoArray(new int[]{9,5,4,9,}, new int[]{9,2,1,4});
    System.out.println("Addition : "+add);
}
