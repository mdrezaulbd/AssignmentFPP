package Assignment3.problem2;


import java.util.Date;

public class HeartRates {

    static final double RHR=70.0;
    static final double LB=0.5;
    static final double UB=0.85;
    String firstName;
    String lastName;
    Date dateOfBirth;

    public HeartRates(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {


        return dateOfBirth;
    }


    public double AgeCalculator()
    {
        Date currentDate = new Date();

        long diffInMillies = Math.abs(currentDate.getTime() -this.dateOfBirth.getTime());
        long diff = (long) (diffInMillies / (24 * 60 * 60 * 1000)); // Convert milliseconds to days

        double  years = (double) (diff / 365);

        return years;


    }

    public double MaximumHeartRate()
    {
      return (220-AgeCalculator());

    }

    public void   targetHeartRateRange()
    {
        double AHR = MaximumHeartRate()-RHR;
        double LBTHR= (AHR*LB) + RHR;
        double UBTHR = (AHR*UB) + RHR;
        System.out.println("The Target Heart Rate Range is between "+ LBTHR+ " and "+  UBTHR);
    }
    @Override
    public String toString()
    {



        //this.dateOfBirth
        return  "First Name :"+firstName+"\n"+  "Last Name :"+
                lastName+"\n"+"Date of Birth:"+this.dateOfBirth+"\n"
                +"Age: "+AgeCalculator()+"\n"+"Maximum Heart Rate:"+(int) MaximumHeartRate();

    }

}
