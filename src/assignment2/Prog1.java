package assignment2;

public class Prog1 {
    public static void main (String []args){

        RandomNumbers r1 = new RandomNumbers();
        int x = r1.getRandomInt(1, 9);
        int y = r1.getRandomInt(3, 14);

        double pix = Math.PI * x;
        double piy = Math.PI * y;

        System.out.print("Random number x in the range 1 .. 9 :" + x + " and pi * x :" + pix);



        System.out.print("\n");

        System.out.print("Random number y in the range 3 .. 14 :" + y+" and pi * y :" + piy);
    }
}
