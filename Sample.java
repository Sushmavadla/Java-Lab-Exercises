package classes;
import java.util.*;
public class Sample {
	int a;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
	}
	void inc()
	{
		a=a+5;
	}
	void dis()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {

		Sample s = new Sample();

s.get();
s.inc();
s.dis();
	}
}

