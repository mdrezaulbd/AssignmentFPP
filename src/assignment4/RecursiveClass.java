package assignment4;

public class RecursiveClass {

    public static void main(String[] args) {

        System.out.println("Result of Problem-1 :");
        RIR(12345);

        System.out.println("\n");
        System.out.println("Result of Problem-2:");
        System.out.println(cDigits(123));


        int[] arr = {1, 2, 3, 4};
        System.out.println("Result of Problem-3:");
        System.out.println(arraySum(arr, arr.length));


    }


    // Assignment 4- problem-1-------reverseIntegerRecurse

    public static void RIR(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            int digit = n % 10;
            System.out.print(digit);
            RIR(n / 10);
        }

    }

    // Assignment 4- problem-2-------

    public static int cDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + cDigits(n / 10);
        }
    }


    // Assignment 4- problem-3-------

    public static int arraySum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + arraySum(arr, n - 1);
        }
    }


}
