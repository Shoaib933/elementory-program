package lovebabbar.arrays;

import java.util.HashSet;

public class FirstRepeatElemArray {

    public static int firstRepeatingIndex(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int firstIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                firstIndex = i;
            } else {
                set.add(arr[i]);
            }
        }
        return firstIndex;
    }

    public static int firstRepeatingElem(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int firstElem = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                firstElem = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return firstElem;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int idx = firstRepeatingIndex(arr);

        if (idx != -1)
            System.out.println("First repeating element: " + arr[idx] + " at index " + idx);
        else
            System.out.println("No repeating element found");


        System.out.println("ELEMENT :::::::::: ");
        int firstElem = firstRepeatingElem(arr);
        System.out.println("First Elem : "+firstElem);
    }
}



