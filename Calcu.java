import java.util.*;
class Calcu
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("enter first number");
 int n1 =sc.nextInt();
  System.out.println("enter second number");
   int n2 =sc.nextInt();
   
   System.out.println("choose choice ");
   int ch = sc.nextInt();
   
   switch(ch)
   {
   case 1:System.out.println(n1+n2);
   break;
    case 2:System.out.println(n1-n2);
   break;
    case 3:System.out.println(n1*n2);
   break;
    case 4:System.out.println(n1/n2);
   break;
    case 5:System.out.println("Default");
   break;
   }
   }
   }