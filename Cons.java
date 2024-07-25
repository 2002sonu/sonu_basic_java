class Cons
{
int pincode;

Cons(int p)
{
   pincode=p;
}
public static void main(String args[])
{
Cons obj=new Cons(201308);
System.out.println("Area code is:"+obj.pincode);
Cons obj2 =new Cons(201309);
System.out.println("Area code is:"+obj2.pincode);
Cons obj3 =new Cons(201310);
System.out.println("Area code is:"+obj3.pincode);

}
}