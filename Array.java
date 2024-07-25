import java.util.Scanner;
import java.util.*;
class Array
{
public static void main(String args[])
{
String names[]={"A","B","C","D","E"};

   Scanner sc = new Scanner(System.in);
 System.out.println("Enter Name");
   String name=sc.nextLine();
   int i=0;
   while(i<names.length){
     if(name.equals(names[i]))
   {
System.out.println("VALID");
break;
}
else
{
System.out.println("INVALID");
break;
}

}
}
}