class Math1
{
void add(int x,int y)
{
System.out.println("Addition of x&y is:"+(x+y));
}
void add(float x,float y)
{
System.out.println("Addition of x&y is:"+(x+y));
}
public static void main(String args[])
{
Math1 obj=new Math1();
obj.add(15.5f,20.0f);
}
}