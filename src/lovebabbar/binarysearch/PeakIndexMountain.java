package lovebabbar.binarysearch;

public class PeakIndexMountain {

    static void main() {
        int[] arr = {0,10,5,2};
        int index = findPeak(arr);

        IO.println("Peak Index is : "+index);
    }

    static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s)/2;
        while (s<e) {
            if (arr[mid] < arr[mid +1]) {
                s= mid+1;
            } else {
                e=mid;
            } mid = s+(e-s)/2;
        }return s;

    }
}
