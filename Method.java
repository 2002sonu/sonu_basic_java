import java.util.Scanner;
  class Method
  {
  public static void sum()
  {
  int x=20,y=30;
  int z=x+y;
  System.out.println(z);
  }
  void disp()
  {
  System.out.println("This is Display");
  }
  public static void main(String args[])
  { 
  sum();
  Method obj = new Method();
  obj.disp();
  }
  }