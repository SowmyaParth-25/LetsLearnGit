
public class Project extends Sample {
	public void empDOB() {
		System.out.println("Employee dob is 12/3/1992");

	}
	
	public void empValid() {
		System.out.println("Employee valid Y/N:");

	}
	public static void main(String[] args) {
		Project p=new Project();
		p.empId();
		p.empDOB();
		p.empValid();
	}

}
