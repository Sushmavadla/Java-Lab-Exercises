package inheritance;
abstract class Student  
{
	private String stu_name;
	Student(String name)
	{
		this.stu_name=name;
	}
	//abstract method
	abstract void count();
	void type()
	{
		System.out.println("Hostel or dayscholar");
	}
}

class Cbse extends Student
{

	Cbse(String name) {
		super(name);
	}

	@Override
	void count() {
		System.out.println("count the students");
	}
	
}
public class StudentAbstractCls {
	public static void main(String[] args) {
		Cbse on=new Cbse("abcd");
		on.count();
		on.type();
	}

}
