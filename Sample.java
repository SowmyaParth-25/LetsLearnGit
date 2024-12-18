import java.util.Scanner;

public class Sample {
	
public void empId() {
	System.out.println("employee id:3344455");
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Sample s=new Sample();
		
		System.out.println("Employee name is:");
	String empName = sc.next();
		System.out.println("Employee name is:"+empName);
		

		
		System.out.println("Employee id is ");
		int empId=sc.nextInt();
		System.out.println("Employee id is:"+empId);
		//s.empId();
	}

}
