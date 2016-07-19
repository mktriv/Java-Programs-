
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tstudent;
Scanner s=new Scanner(System.in);
System.out.println("Enter the total number of the Students ");
tstudent=s.nextInt();
		Student stu[]=new Student[tstudent];
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("Enter the details of the Student ");
			stu[i]=new Student();
			stu[i].ReadInfo();
		}
		
		System.out.println("Select the Choice by pressing the Corresponding Number");
		System.out.println("-------------------------------");
		System.out.println("1) All Student details");
		System.out.println("2) Topper of the class");
		System.out.println("3) detail by roll number");
		System.out.println("4) Sort ist acc. to Marks");
		System.out.println("---------------------------------");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			for(int i=0;i<stu.length;i++)
			{
				stu[i].Display();
			
			}
			break;
		case 2:
			for(int i=0;i<stu.length;i++)
			{
				stu[i].topper();
			
			
		}
			break;
		case 3:
		for(int i=0;i<stu.length;i++)
		{
			stu[i].roll();
			stu[i].Display();
		}
		break;
		case 4:
			for(int i=0;i<stu.length;i++)
			{
				stu[i].rollsort();
				stu[i].Display();
			}
			break;
		}
	}

}
