

public class PrintMaxNumber {
    static int printMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        return max;
    }


    static int printMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }

        }
        return min;
    }
}

static void main() {
    int max = PrintMaxNumber.printMax(new int[]{10, 20, 30, 40, 50, 60, 70, 80});
    int min = PrintMaxNumber.printMin(new int[]{10, 20, 30, 40, 50, 60, 70, 80});
    System.out.println("Max No. : "+max);
    System.out.println("Min No. : "+min);
}
