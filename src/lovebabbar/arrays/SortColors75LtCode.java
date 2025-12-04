package lovebabbar.arrays;

import java.util.Arrays;

public class SortColors75LtCode {
    static void main() {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
    }
    static void sortColors(int[] arr) {
        int l =0;
        int m =0;
        int h = arr.length-1;

        while(m<=h) {

            if(arr[m] == 0) {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++; m++;
            } else if (arr[m] == 1) {
                m++;

            } else {
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;
                h--;
             }
        }
        Arrays.stream(arr).forEach((a)-> System.out.print(" "+a));
    }
}

