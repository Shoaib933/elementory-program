import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/dsa/find-unique-element-element-occurs-k-times-except-one/
public class FindUniqueKTimes {

    public static int findUniqueElement(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() != k) {
                return entry.getKey();
            }
        }
        return -1; // or any suitable default value to indicate no unique element found
    }
}


public static void main(String[] args) {
    int[] arr = {6, 2, 5, 2, 2, 6, 6};
    int k = 3;
    int uniqueElement = FindUniqueKTimes.findUniqueElement(arr, k);
    if (uniqueElement != -1) {
        System.out.println("Unique element: " + uniqueElement);
    } else {
        System.out.println("No unique element found.");
    }
}
