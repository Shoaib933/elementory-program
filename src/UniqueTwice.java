//https://www.geeksforgeeks.org/dsa/find-element-appears-array-every-element-appears-twice/
public class UniqueTwice {
    static int finduniqueHashMap(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i =0; i<arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }

    static int  finduniqueXor(int []arr) {
        int res = 0;
        for (int i=0; i<arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}


public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
//    System.out.println(UniqueTwice.finduniqueHashMap(arr));
    System.out.println(UniqueTwice.finduniqueXor(arr));
}
