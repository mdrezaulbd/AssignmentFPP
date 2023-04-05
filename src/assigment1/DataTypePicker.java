package assigment1;

public class DataTypePicker {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();

        int randomNumber = randomNumbers.getRandomInt(0, 2000000000);

        System.out.println("Random Number: " + randomNumber);

        if (randomNumber <= Byte.MAX_VALUE && randomNumber >= Byte.MIN_VALUE) {
            System.out.println("Preferred Data Type: byte");
        } else if (randomNumber <= Short.MAX_VALUE && randomNumber >= Short.MIN_VALUE) {
            System.out.println("Preferred Data Type: short");
        } else if (randomNumber <= Integer.MAX_VALUE && randomNumber >= Integer.MIN_VALUE) {
            System.out.println("Preferred Data Type: int");
        } else if (randomNumber <= Long.MAX_VALUE && randomNumber >= Long.MIN_VALUE) {
            System.out.println("Preferred Data Type: long");
        } else {
            System.out.println("Preferred Data Type: BigInteger");
        }
    }
}


