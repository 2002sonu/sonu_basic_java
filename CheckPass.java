import java.util.Scanner;
   class CheckPass
   {
     public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Marks ");
	   int Marks = sc.nextInt();
	   
	   if(Marks < 30)
	   {
	   {
	   System.out.println("you are fail");
	   }
	   if(Marks >=30 && Marks <=45)
	   {
	   System.out.println("you are passed with 3rd division");
	   }
	   if (Marks >=46 && Marks <=59){
	   System.out.println("you are passed with 2nd division");
	   }
	   }
	   else
	   {
	   System.out.println("you are passed with 1st division");
	   }
	 }
	} 
	 
	   