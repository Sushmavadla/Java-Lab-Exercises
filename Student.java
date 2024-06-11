package array;

public class Student {
private int rollNo;
private String name;
private float marks;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public static void main(String[] args) {
		Student s=new Student();
		s.setRollNo(101);
		s.setName("AAA");
        s.setMarks(100);
        System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks());
}
}
