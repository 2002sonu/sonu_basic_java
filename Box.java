class Box
{
private int l,b,h;


void setDimension(int x,int y,int z)
{
  this.l=l;this.b=b;this.h=h;
}
  
  public static void main(String args[])
  {
	 int volume=l*b*h;
  Box b = new Box();
  b.setDimension(10,3,8);
   System.out.println(volume);
 
  }
  }