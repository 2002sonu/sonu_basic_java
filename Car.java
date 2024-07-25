class Car
{
	String name;
	double price;
	int topspeed;
	String fuelType;
	
	
	void setValue(String n,double p,int t,String f)
	{
		name=n;
		price=p;
		topspeed=t;
		fuelType=f;
	}
	void display()
	{
		System.out.println("Name of car is: "+name);
		System.out.println("price of car is: "+price + " Lakhs");
		System.out.println("topspeed of car is: "+topspeed+ " Km/Hr");
		System.out.println("fuelType of car is: "+fuelType);
	}
	public static void main(String args[])
	{
		Car c=new Car();
       c.setValue("Audi",4500000.00,241,"petrol");
       c.display();
	}
}	