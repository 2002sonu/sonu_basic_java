//Copy Of Array
class A
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int b[]=new int[a.length];

for(int i=0;i<a.length;i++)
{
b[i]=a[i];
}
System.out.println("Element of a:");
int i =0;
for(i=0;i<a.length;i++)
{
	System.out.println(a[i]+"");
}
System.out.println("Element of b:");
for(i=0;i<b.length;i++)
{
	System.out.println(b[i]+"");
}
}
}