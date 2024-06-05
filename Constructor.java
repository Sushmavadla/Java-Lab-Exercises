package classes;

public class Constructor {
	public Constructor()
	{
		System.out.println("constructor example");
	}
	
	public Constructor(int a)
	{
		a++;
		System.out.println(a);
	}
	void call(String msg)
	{
		System.out.println(msg);
	}
    int add(int a,int b)
    {
    	return a+b;
    }
    char show()
    {
    	return 'a';
    }
	public static void main(String[] args) {
     
		Constructor on=new Constructor();
		Constructor on2 = new Constructor(3);
        on.call("Welcome");
        System.out.println(on.add(10,11));
        char ch=on.show();
        System.out.println(ch);
	}
}
