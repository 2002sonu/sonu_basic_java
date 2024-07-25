
import java.util.Scanner;
class Employee{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Emp id\t:");// String name = sc.nextLine();
   int id = sc.nextInt();
   System.out.print("Enter  Emp Basic Salary\t:");
   int Salary = sc.nextInt();
   
   float DA = (Salary*10/100 );
   float HRA =(Salary*15/100 );
   
   float grossSalary = (DA + HRA +Salary);
   float taxPay = (grossSalary*11/100 );
   
   float remaingSalary =(grossSalary-(grossSalary*11/100));
   
   System.out.println("Employee id is :"+id); 
   System.out.println("Employee salary is :"+Salary); 
   System.out.println("Employee DA is :"+DA); 
   System.out.println("Employee HRA is :"+HRA); 
   System.out.println("Employee grossSalary is :"+grossSalary);
   System.out.println("Employee taxPay is :"+taxPay);
   System.out.println("Employee remaingSalary is :"+remaingSalary);
  }
}
   
   