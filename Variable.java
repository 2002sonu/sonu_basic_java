class Variable
{
   String name;
   double salary;
   int age;
     
	 
	 void setDetail(String n,double s,int a)
	 {
	 name=n;
	 salary=s;
	 age=a;
	 }
	 void displayDetail()
	 {
	 System.out.println("Employee name is"+name);
	 System.out.println("Employee salary is"+salary);
	 System.out.println("Employee age is"+age);
	 }
	 
	 public static void main(String args[])
	 {
	 Variable obj = new Variable();
	   obj.setDetail("Sonu kumar",19000.00,25);
	   obj.displayDetail();
	   }
	   }