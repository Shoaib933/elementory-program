

public class ArrayIntersection {

    static int[] findIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    al.add(arr1[i]);
                    arr2[j] = -1;
                }
            }
        }
        Collections.sort(al);
        int[] arr = al.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}


static void main() {
    int[] res = ArrayIntersection.findIntersection(new int[]{1,2,3,4,5,6,7,8},
            new int[]{3,4,9,10});
    Arrays.stream(res).forEach((a) -> System.out.print(" "+a));
 }
