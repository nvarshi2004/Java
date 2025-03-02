import java.util.*;
class votereligibility
{
  public static void main(String ar[])
  {
    int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age:");
	a=sc.nextInt();
	String k=a>=18? "Your are eligible": "Your are not eligible";
	System.out.println(k);
  }
}