 interface Bird1
 {
  public abstract void fly();
  }
  class Parrot implements Bird1
  {
  public void fly()
  {
  System.out.println("Flying from one tree to other");
  }
  public static void main(String args[])
  {
  Parrot b =new Parrot();
  b.fly();
  }
  }