package Assignment3;

public class Main {
     public  static void main(String []args)
   {
       Customer []customers=new Customer[3];

       customers[0]=new Customer("John", "Doe", "123-45-6789");
       customers[0].setBillingAddress(new Address("123 Main St", "Chicago", "CA", "12345"));
       customers[0].setShippingAddress(new Address("2346 Main St", "NewYork", "NY", "3456"));

       customers[1]=new Customer("Reza", "khan", "123-45-6547");
       customers[1].setBillingAddress(new Address("123 Main St", "Texas", "TX", "2345"));
       customers[1].setShippingAddress(new Address("2346 Main St", "NewYork", "NY", "4267"));


       customers[2]=new Customer("Rafi", "Khan", "123-45-9034");
       customers[2].setBillingAddress(new Address("123 Main St", "California", "CA", "1597"));
       customers[2].setShippingAddress(new Address("2346 Main St", "Chicago", "NY", "3578"));

       for(Customer cut: customers)
       {
           if(cut.getBillingAddress().getCity().equals(Customer.IMPORTANT_BILLADD) )
               System.out.println("Found the City! "+cut.toString());

       }
   }
}
