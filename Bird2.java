abstract class Bird2
{
abstract void fly();
abstract void eat();
}
class Parrot extends Bird2
{
   void fly()
   {
 System.out.println("flying");
 }
   void eat()
 {
 System.out.println("eating");
 }
 public static void main(String args[])
 {
 Parrot p =new Parrot();
 p.fly();
 p.eat();
 }
 }
 
 
 