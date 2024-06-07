package functions;
import java.util.Scanner;
public class UserDefinedFun1WOPWOR {
	public void add()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedFun1WOPWOR ob=new  UserDefinedFun1WOPWOR();
       ob.add();
	}

}
