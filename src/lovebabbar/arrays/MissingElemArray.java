

public class MissingElemArray {

    // -ve marking or visited approach
    static int findMissingElemVisited(int[] arr) {
        int res = -1;
        for (int i=0; i<arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index-1] > 0){
                arr[index-1] *= -1;
            }
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0)
                return res = i+1;
        }
        return res;
    }

    static int findMissingElemSortSwap(int[] arr) {
        int i=0;
        int res = -1;
        while (i < arr.length) {

            int index = arr[i] -1;
            if (arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

            } else {
                i++;
            }

        }
        for (int j=0; j<arr.length; j++) {
            if (arr[j] != j+1)
                res = j+1;
        }
        return res;
    }

}

static void main() {
    int miss = MissingElemArray.findMissingElemVisited(new int[]{1,4,3,4,5});
    System.out.println(" Visited OR -ve Marking approach");
    if (miss == -1){
        System.out.println("No Missing ELmement");
    } else {
        System.out.println("Missing ELement IS : "+miss);
    }
    System.out.println("Sorting & Swapping Approach");
    int missSort = MissingElemArray.findMissingElemSortSwap(new int[]{1,4,3,4,5});

    if (missSort == -1){
        System.out.println("No Missing ELmement");
    } else {
        System.out.println("Missing ELement IS : "+missSort);
    }

}
