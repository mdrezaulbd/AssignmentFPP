package assignment2;

import java.util.Arrays;

public class RemoveDups {

    public static void main(String[] args) {

        String[] a = {"horse", "dog", "cat", "horse", "dog" };
        int count = 0, i, j;
        String[] tmparray = new String[a.length];

        for (i = 0; i < a.length; i++) {

            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }

            }

            if (j == i) {
                tmparray[count++] = a[i];
            }

        }

        String[] resultarray = new String[count];

        for (int k = 0; k < count; k++)
            resultarray[k] = tmparray[k];

        System.out.println(Arrays.toString(resultarray));
    }
}
