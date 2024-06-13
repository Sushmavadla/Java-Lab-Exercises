package calculator;
class Operations{
	public int calculate(int a,int b,int c) {
		return a+b+c;
	}
	public int calculate(int a,int b) {
		return a-b;
	}
	public int calculate(int a,int b,int c,int d) {
		return  a*b*c*d;
	}
	public double calculate(double a,double b) {
		return  a/b;
	}
	public float calculate(float a,float b) {
		return  a%b;
	}
}
public class CalcPoly {
		public static void main (String args[]) {
        Operations op=new Operations();
        System.out.println(op.calculate(1,2,3));
        System.out.println(op.calculate(4,2));
        System.out.println(op.calculate(1,2,3,4));
        System.out.println(op.calculate(10,5));
        System.out.println(op.calculate(20,4));
	
	}
}
