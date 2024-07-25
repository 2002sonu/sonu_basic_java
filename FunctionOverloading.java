// POLYMORPHISM : Method Overloading   "Compile Time Polymorphism"
// Method Overlating :1)Same Name as Method 2).within Same Class 3).Having Different Argumrnt or Parameter 3.1).no of argument 3.2)sequence of argument 3.3)Type of argument
/*3.1)
class Maths
{
	void area(int r)
	{
		System.out.println("Area of circle is:"+(3.14*r*r));
	}
	void area(int l, int b)
	{
		System.out.println("Area is:"+(l*b));
	}
	public static void main(String args[])
	{
		Maths m = new Maths();
		m.area(5);
	}
}*/

 /*3.2)
 class second 
 {
	 void test(int x,String a)
	 {
	 System.out.println("xyz");
	 }
	 void test(String b,int y)
	 {
		 System.out.println("abc");
	 }
	 public static void main(String args[])
	 {
		test t = new test();
		t.test("ds",10)
	 }
 }*/
 /*3.3)
 class third
 {
	 void test1(int a)
	 {
		 System.out.println("none")
	 }
	 void test1(String b)
	 {
		 System.out.println("yes")
	 }
 public static void main(String args[])
 {
	 third obj = new third();
	 obj.test1("tt");
 }
 }*/
	 
class FunctionOverloading
{
/*void shape()
{
System.out.println("This Shape Is Circle");
}
void shape(int l,int b)
{
System.out.println("This Is Rectangle");
}
public static void main(String args[])
{
FunctionOverloading f = new FunctionOverloading();
f.shape(10,20);
}
}*/

void chocolate()
{
	System.out.println("DairyMilk");
}
void chocolate(String c)
{
	System.out.println("kitkat");
}
public static void main(String args[])
{
	FunctionOverloading f=new FunctionOverloading();
	f.chocolate("nestle");
}
}v
 


