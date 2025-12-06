package lovebabbar.arrays;

import java.util.ArrayList;

public class FactOfLargeNum {

    static void fact(int n) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1); // factorial starts with 1

        for (int i = 2; i <= n; i++) {

            int carry = 0;

            for (int j = 0; j < al.size(); j++) {
                int x = al.get(j) * i + carry;

                al.set(j, x % 10);
                carry = x / 10;
            }

//            while (carry > 0) {
//                al.add(carry % 10);
//                carry /= 10;
//            }
            if (carry > 0) {
                al.add(carry);

            }
        }
        //1307674368000
        // Print result in correct order (reverse)
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.print(al.get(i));
        }
    }

    public static void main(String[] args) {
        fact(15);
    }
}

/*
import java.math.BigInteger;

class LargeFactorial {

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 100; // you can change to 500, 1000, etc.
        System.out.println("Factorial of " + n + " is:");
        System.out.println(factorial(n));
    }
}

 */
