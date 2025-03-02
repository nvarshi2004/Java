import java.util.*;
class scan
{
  public static void main(String ar[])
  {
    int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	a=sc.nextInt();
	System.out.println("Enter second number:");
	b=sc.nextInt();
	c=a+b;
	System.out.println("The sum of two numbers: "+c);
  }
}