package Assignment3.problem2;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {

    public  static void main(String []args)  throws ParseException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String firstName=sc.nextLine();

        System.out.println("Please, enter your last name:");
        String lastName=sc.nextLine();

        System.out.println("Please, enter your date of birth(yyyy-mm-dd) :");
        String  dob=sc.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth = dateFormat.parse(dob);

        HeartRates heartRates=new HeartRates(firstName,lastName,dateOfBirth);
        heartRates.targetHeartRateRange();

        System.out.println(heartRates);
    }
}
