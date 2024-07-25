import java.util.Scanner;
class Var
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter number of subjects");
	  int subjects=sc.nextInt();
	  
	  System.out.println("Enter maximum marks");
	  int max=sc.nextInt();
	  
	  System.out.println("Enter the name of the Subjects");
	  String() subjectsName= new String();
	  
  for(int i=0;i<subjects;i++){
      subjectsName[i]=sc.nextLine();
	  
  }
	  System.out.print("\r"+ subjectsName);
  
    System.out.print("Enter Sub1\t");
   String Sub1 = sc.nextLine();
  System.out.print("Enter Sub2\t");
   String Sub2 = sc.nextLine();
   System.out.print("Enter Sub3\t");
   String Sub3 = sc.nextLine();
   System.out.print("Enter Your Marks in Sub1\t");
    float Marks1 = sc.nextFloat();
	 System.out.print("Enter Your Marks in Sub2\t/t");
  float Marks2 = sc.nextFloat();
    System.out.print("Enter Your Marks in Sub3\t");
    float Marks3 =sc. nextFloat();

	 float Percentage=((Marks1+Marks2+Marks3)/(subjects*max))*100;
	 System.out.println("Percentage: "+ Percentage);

	  if(Percentage<30)
		 System.out.println("You are fail");
	 if(Percentage>=30 && Percentage<=45)
		 System.out.println("Pass with 3rd division");
	 if(Percentage>=46 && Percentage<=59)
		 System.out.println("Pass with 2nd division");
	 if(Percentage>=60)
		 System.out.println("Pass with 1st division");

	}
   }