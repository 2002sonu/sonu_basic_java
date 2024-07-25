//Multiple Inheritends
class DadaJi
{
void Banglow()
{
System.out.println("<<<<<<<SWARG>>>>>>");
}
}
class PapaJi extends DadaJi
{
void Car()
{
System.out.println("<<<<<<<Audi>>>>>>");
}
}
class BetaJi extends PapaJi
{
public static void main(String args[])
{
BetaJi obj = new BetaJi();
obj.Banglow() ;
obj.Car();
}
}