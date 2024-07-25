  import java.util.Scanner;
  
class cir{

   public static void main(String args[])
   {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter radius");
   float radius = sc.nextFloat();
  
		float pi = 3.14f;
		float area= pi*radius*radius;
		float circumference= 2*pi*radius;
		System.out.println(area);
		System.out.println(circumference);
}		
}