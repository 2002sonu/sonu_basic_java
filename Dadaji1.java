class Dadaji1
{
void car()
{
System.out.println("Horse");
}
}
class Papaji1 extends Dadaji1
{
void car()
{
System.out.println("Bike");
}
public static void main(String args[])
{
Papaji1 p=new Papaji1();
p.car();

}
}