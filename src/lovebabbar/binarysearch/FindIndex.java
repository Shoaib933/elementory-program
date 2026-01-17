package lovebabbar.binarysearch;

public class FindIndex {
    static void main() {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 6;
        int index = findElemIndex(arr, target);
        if (index == -1)
            IO.println(target+ " : Target Not Founf ");
        else
            IO.println(target+ " : found at index -: "+index);
    }

    static int findElemIndex(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s)/2;

        while (s<=e) {
            if (target==arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                e = mid-1;
            } else if (target > arr[mid]){
                s = mid+1;
            } mid = s + (e-s)/2;
        } return -1;
    }
}
