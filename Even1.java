//Even Number btn 0 to 100

class Even1
/*public static void main(String args[])
{
int sum=1;
for( int i=1;i<=100;i++)
{
int result=sum+i++;
System.out.println("Even no :"+result);
}
}
}*/
{
public static void main(String args[])
{
int sum=0;
for( int i=1;i<=100;i++)
{
	if(i%2==0)
    sum += i;
System.out.println(sum);
}
}
}