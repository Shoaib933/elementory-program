package lovebabbar.binarysearch;

public class FindOccur {
    static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,6,7};
        int target = 4;
        int firstOcccur = findFirstOccur(arr, target);
        if (firstOcccur != -1) IO.println("First Occurrence ==  "+firstOcccur);
        else IO.println(" Not Found...");

        int lastOcccur = findLastOccur(arr, target);
        if (lastOcccur != -1) IO.println("First Occurrence ==  "+lastOcccur);
        else IO.println(" Not Found...");

        IO.println("total Occurrences = : "+((lastOcccur - firstOcccur) +1 ));
    }
    static int findFirstOccur(int[] arr, int target) {
        int e = arr.length-1;
        int s= 0;
        int mid = s + (e-s)/2;
        int x = -1;

        while (s<=e) {
            if (target == arr[mid]) {
                x = mid;
                e = mid - 1;
            } else if (target < arr[mid]) {
                e = mid-1;
            } else if (target > arr[mid]) {
                s = mid+1;
            }       mid = s + (e-s)/2;
        } return x;
    }
    static int findLastOccur(int[] arr, int target) {
        int e = arr.length-1;
        int s = 0;
        int mid = s + (e-s)/2;
        int x = -1;

        while (s<=e) {
            if (target == arr[mid]) {
                x = mid;
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid-1;
            } else if (target > arr[mid]) {
                s = mid+1;
            }       mid = s + (e-s)/2;
        } return x;
    }
}
