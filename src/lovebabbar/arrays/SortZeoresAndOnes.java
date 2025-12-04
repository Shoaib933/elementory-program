package lovebabbar.arrays;

import java.util.Arrays;

public class SortZeoresAndOnes {
    static void main() {
        int[] arr = {0,1,0,1,1,0,1,0,1,1};
        /*
        int s = 0;
        int e = arr.length-1;
        int i = 0;

       while(i<=e) {
           if (arr[i] == 0) {
               int temp = arr[s];
               arr[s] = arr[i];
               arr[i] = temp;
               s++; i++;
           }
           if (arr[i] == 1) {
               int temp = arr[e];
               arr[e] = arr[i];
               arr[i] = temp;
               e--;
           }
       }
        Arrays.stream(arr).forEach(a -> System.out.print(a+","));
*/
        leftShift(arr);
    }

    static void leftShift(int[] arr) {
        int l=0; int h = arr.length-1;
        while(l<h) {
            if (arr[l]==0) {
                l++;
            } else if (arr[h] == 1) {
                h--;
            } else {
                int temp = arr[l];
                arr[l] = arr[h] ;
                arr[h] = temp;
            }
        }
        System.out.println("Another approach");
        Arrays.stream(arr).forEach((a)-> System.out.print(" "+a));


    }
}
