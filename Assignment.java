import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  System.out.println("Please Enter Student ids :");
  int id=sc.nextInt();
  System.out.println("Enter Student Name :");
  String name=sc.nextLine();
  System.out.println("Enter Student Course :");
  String course=sc.nextLine();
  
  int detail[]=new int[3];
  
  for( int i=0;i<3;i++)
  {
	 
	 
	  System.out.println("********************************");
	  for(int value : id)
	  {
		  System.out.println(value);
	  }
	 
  }
	}
}
  