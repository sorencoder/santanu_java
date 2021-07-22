import java.util.Scanner;
class Main{
  public static void main (String[] args) {
      double area, pi,r;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle: ");
      r=sc.nextDouble();
      pi=3.14;
      area = pi*r*r;
      System.out.println("Area of the circle: "+area);
    }
}
