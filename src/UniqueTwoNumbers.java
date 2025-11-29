//https://www.geeksforgeeks.org/dsa/find-two-non-repeating-elements-in-an-array-of-repeating-elements/
public class UniqueTwoNumbers {

    static int[] singleNum(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int a:arr) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                al.add(entry.getKey());
            }
        }
        // Sort the result
        Collections.sort(al);
        // Convert to int[]
        int[] result = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i);
        }
        return result;
    }
}


public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 1, 4};
    int[] res = UniqueTwoNumbers.singleNum(arr);

    for (int x : res) {
        System.out.print(x + " ");
    }
    System.out.println();
}