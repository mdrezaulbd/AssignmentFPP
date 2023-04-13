package assignment5.problem2;

import java.time.LocalDate;
import java.util.Scanner;

class DeptEmployee
{
public    double salary;
private  String name;
private LocalDate hireDate;

DeptEmployee(String name,double salary ,LocalDate hireDate){

    this.name=name;
    this.salary=salary;
    this.hireDate=hireDate;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }


   public double computeSalary(){
    return  this.salary;
   }
}
 class Professor  extends  DeptEmployee{
     private  int numberOfPublications;
      Professor(String name, double salary, LocalDate hireDate,int numberOfPublications) {
         super(name, salary, hireDate);
         this.numberOfPublications=numberOfPublications;
     }

     public int getNumberOfPublications() {
         return numberOfPublications;
     }

     public void setNumberOfPublications(int numberOfPublications) {
         this.numberOfPublications = numberOfPublications;
     }
 }

 class Secretary extends DeptEmployee{

   private double overtimeHours;

     Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary(){
         return super.salary+(12*overtimeHours);
     }
}

class Main {
    public static void main(String []args){
        Professor p1=new Professor("Jhon",50000.0,LocalDate.of(2000, 1, 1),10);
        Professor p2=new Professor("Reza",30000.0,LocalDate.of(2001, 2, 3),14);
        Professor p3=new Professor("Tanvir",100000.0,LocalDate.of(1999, 12, 12),20);

        Secretary s1=new Secretary("Kabir",16000.0,LocalDate.of(2003,1,1),10);
        Secretary s2=new Secretary("Devid",12000,LocalDate.of(2004,2,1),12);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0]=p1;
        department[1]=p2;
        department[2]=p3;
        department[3]=s1;
        department[4]=s2;
        double totalSalary=0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wish to see the sum of all Professor and Secretary salary in the department ?:");
        String input=scanner.nextLine();
        if(input.equalsIgnoreCase("Y"))
        {
           for(DeptEmployee d:department)
           {
               totalSalary=totalSalary+d.computeSalary();
           }
            System.out.println("Total Salary of the department is: "+ totalSalary);
        }
        scanner.close();






    }


        }