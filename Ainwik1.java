import java.util.Scanner;
class Ainwik1
{
public static void main(String args[])
{
String name[]={"A","B","C","D","E"};
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name");
String n=sc.nextLine();

boolean status=false;
for(int i=0;i<name.length;i++)
{
if(n.equals(name[i]))
{
status=true;
break;
}
}
if(status==true)
{
System.out.println("name found");
}
else
{
System.out.println("not found");
}
}
}