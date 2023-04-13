package assignment5.problem5;

public class Main {
    public   static void main(String []args)
    {
      Computer computer1 = new Computer("Dell", "Intel Core i7", 8, 3.5);
      Computer computer2 = new Computer("HP", "AMD Ryzen 7", 16, 4.2);


        if (computer1.equals(computer2)) {
            System.out.println("The two computers are equal");
        } else {
            System.out.println("The two computers are not equal");
        }

        int hash1 = computer1.hashCode();
        int hash2 = computer2.hashCode();
        System.out.println("Hash code of computer1: " + hash1);
        System.out.println("Hash code of computer2: " + hash2);
        if (hash1 == hash2) {
            System.out.println("The hash codes are equal");
        } else {
            System.out.println("The hash codes are not equal");
        }



    }
}
