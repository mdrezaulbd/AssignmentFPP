package assignment5.problem4;

public class Main {
    public  static void main(String []args)
    {
         Employee []employees=new Employee[5];

         employees[0]= new BasePlusCommissionEmployee("Reza","Khan","123-567-234",
                 200000.0,5.0,30000.0);
        employees[1]= new CommissionEmployee("Rafi","Khan","123-567-235",
                300000.0,6.0);
        employees[2]= new CommissionEmployee("Shourav","Islam","123-567-236",
                350000.0,5.0);

        employees[3]= new HourlyEmployee("Devid","jhon","123-567-238",
                25000,15.0);
        employees[4]= new SalariedEmployee("Tania","Afroj","123-567-234",
                2000.0);
        double totalSalary=0.0;

        for(Employee e: employees)
        {
            totalSalary=totalSalary+e.getPayment();
        }

        System.out.println("Total Salary :"+totalSalary);

    }
}
