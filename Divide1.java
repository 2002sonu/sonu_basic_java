//Dividend=divisor*quotient+remainder
import java.util.*;
public class Divide1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend :");
        int Dividend = sc.nextInt();
        System.out.print("Enter divisior :");
        int divisior = sc.nextInt();
     int quotent = Dividend/divisior;
     int remainder = Dividend%divisior;
     System.out.println("quotent is :"+quotent);
     System.out.println("remainder is :"+remainder);
    }
}
