import java.util.Scanner;
  class InputAge
 {
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.print("please enter your age:");
	    int age = sc.nextInt();
		String msg =(age>=18)?"vote for modiji":"beta ghar jaoo";
		System.out.println("msg is: "+msg);
	}
}
	 