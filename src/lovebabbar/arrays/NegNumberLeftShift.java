

public class NegNumberLeftShift {

    static void leftShift(int[] arr) {
        int l=0; int h = arr.length-1;
        while(l<h) {
            if (arr[l]<0) {
                l++;
            } else if (arr[h] >0) {
                h--;
            } else {
                int temp = arr[l];
                arr[l] = arr[h] ;
                arr[h] = temp;
            }
        }
        Arrays.stream(arr).forEach((a)-> System.out.print(" "+a));


    }
}

static void main() {
    NegNumberLeftShift.leftShift(new int[]{1,2,-3,4,-5,6});
}
