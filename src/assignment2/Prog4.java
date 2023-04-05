package assignment2;

public class Prog4 {

    public static void main(String[] args) {

        float f1 = 1.27f, f2 = 3.881f, f3 = 9.6f;

        int sum = (int) (f1 + f2 + f3);

        int sumround = (int) Math.round(f1 + f2 + f3);

        System.out.println("the sum of the floats as an integer, obtained by casting the sum to type int :" + sum);
        System.out.println("\n");
        System.out.println("the sum of the floats as an integer, using the Math.round function : :" + sumround);

    }
}
