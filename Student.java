package MyPackage;
import java.util.Scanner;
import java.util.Arrays;
public class Student {

private String stu_name;
private int stu_roll;
private int stu_marks;
public String getStu_name() {
	return stu_name;
}
public void setStu_name(String stu_name) {
	stu_name = stu_name;
}
public int getStu_roll() {
	return stu_roll;
}
public void setStu_roll(int stu_roll) {
	this.stu_roll = stu_roll;
}
public int getStu_marks() {
	return stu_marks;
}
public void setStu_marks(int stu_marks) {
	this.stu_marks = stu_marks;
}

Scanner s=new Scanner(System.in);

public void ReadInfo()
{
	System.out.println("Enter the Student name");
	stu_name=s.nextLine();
	System.out.println("Enter the Student Roll Number");
	stu_roll=s.nextInt();
	System.out.println("Enter the Student Marks");
	stu_marks=s.nextInt();
	
}
public void Display()
{
	
	System.out.println("Student name is :"+stu_name);
	System.out.println("Student roll number is " +stu_roll);
	System.out.println("Student mark is "+stu_marks);
	System.out.println();
	}
	
public void topper(){
	this.getStu_marks();
	int max=0;
	for(int i=0;i<stu_marks;i++)
	{
		if(stu_marks>max)
		{
			max=stu_marks;
			System.out.println("the topper of the class is " +max);
		}
	}
	
}
public void roll() {
	// TODO Auto-generated method stub
	this.getStu_roll();
	int rollnumber;
	System.out.println("enter the roll number");
	rollnumber=s.nextInt();	
}
public void rollsort(){
	int a[]=new int[100];
	int swap;
	for(int i=0;i<a.length;i++)
	{
		a[i]=this.getStu_roll();
		
	}
	 for (int i = 0; i < ( a.length - 1 ); i++) {
	      for (int j = 0; j < a.length - i - 1; j++) {
	        if (a[j] > a[j+1])
	        {
	          swap       = a[j];
	          a[j]   = a[j+1];
	          a[j+1] = swap;
	        }
	      }
	    }
	  }
	

}


