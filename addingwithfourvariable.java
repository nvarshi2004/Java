import java.util.*;
class scan
{
  public static void main(String ar[])
  {
    int a,b,c,d,e;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	a=sc.nextInt();
	System.out.println("Enter second number:");
	b=sc.nextInt();
	System.out.println("Enter third number:");
	c=sc.nextInt();
	System.out.println("Enter fourth number:");
	d=sc.nextInt();
	e=a+b+c+d;
	System.out.println("The sum of three numbers: "+e);
  }
}