package assignment2;

import java.util.Arrays;

public class Prog5 {

    public static void main(String[] args) {
        Prog5 obj1=new Prog5();
     int []a={5,6,-4,3,1};
     int []b={ 3,8,9,11};
     int []outArr=new int[a.length+b.length];
        outArr=obj1.combine(a,b);

        System.out.println(Arrays.toString(outArr));
    }

    public int[] combine(int[] a, int[] b){

        int []c=new int [a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        return c;

    }


}
