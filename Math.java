//Method Overloading
class Math
{
void area(int r)
{
System.out.println("Area of circle is:"+(3.14*r*r));
}
void area(int l,int b)
{
System.out.println("Area of rectangle:"+(l*b));
}
public static void main(String args[])
{
Math obj = new Math();
obj.area(167);
}
}
