package functions;
import java.util.Scanner;
public class UDF3WOPWR {
	public int add()
	   {
		    int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			return c;
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UDF3WOPWR ob=new  UDF3WOPWR();
		    int z=ob.add();
		    System.out.println(z);
		}
}
