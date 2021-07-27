//program to swap two numbers
import java.util.Scanner;
class Main{
  public static void main (String[] args) {
     int a,b,c;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     a=sc.nextInt();
     System.out.println("Enter another number: ");
     b=sc.nextInt();
     System.out.println("Numbers before swapping");
     System.out.println("a: "+a);
     System.out.println("b: "+b);
     c=a;
     a=b;
     b=c;
     System.out.println("Numbers after swapping");
     System.out.println("a: "+a);
     System.out.println("b: "+b);
    }
}
