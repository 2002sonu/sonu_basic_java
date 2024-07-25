// Hierarchical Inheritence
class DadaJi
{
void Banglow()
{
System.out.println("<<<<<<<SWARG>>>>>>");
}
void Car()
{
System.out.println("<<<<<<<Audi>>>>>>");
}
}
class PapaJi extends DadaJi
{
	public static void main(String args[])
	{
PapaJi obj = new PapaJi();
obj.Banglow();
	}

}
class UncleJi extends DadaJi
{
public static void main(String args[])
{
UncleJi obj = new UncleJi();

obj.Car();
}
}