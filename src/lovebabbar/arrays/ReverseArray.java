public class ReverseArray {
    static void revArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s<=e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++; e--;

        }
        Arrays.stream(arr).forEach((a) -> System.out.print(a+", "));
    }


}

static void main() {
    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
    ReverseArray.revArray(arr);
}
