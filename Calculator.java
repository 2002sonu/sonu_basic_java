import java.util.*;
class Calculator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("enter first number");
 int n1 =sc.nextInt();
  System.out.println("enter second number");
   int n2 =sc.nextInt();
   
   System.out.println("enter choice");
   int ch = sc.nextInt();
   
   if(ch==1)
   {
    int add=n1+n2;
   System.out.println("Addition is :"+add);
   }
   else if(ch==2)
   {
  int sub=n1-n2;
 System.out.println("Substraction is :"+sub); 
   }
   else if(ch==3)
   {
  int mul=n1*n2;
    System.out.println("Multiplication is :"+mul);
	}
	else if(ch==4)
	{
	int div=n1/n2;
	 System.out.println("Divide is :"+div);
	 }
	 }
	 }
  