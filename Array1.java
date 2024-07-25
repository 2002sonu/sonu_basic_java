import java.util.Scanner;
import java.util.*;
class Array1
{
public static void main(String args[])
{
String names[]={"AMAN","BOBZY","CHUTIYA","DIWAN","ETAWA"};

   Scanner sc = new Scanner(System.in);
 System.out.println("Enter Name");
   String name=sc.nextLine().toUpperCase();
   
   boolean flag=false;
   for(int i=0;i<names.length;i++){
   
   if(name.equals(names[i]))
   {
   System.out.println("valid");
   flag=true;
   break;
}
   
}
if(!flag){
	System.out.println("Invalid");

}
}
}
