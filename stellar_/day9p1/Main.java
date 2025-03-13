import java.util.*;

class employee1{
	private int Empid;
	private String name;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("employee name :"+name+"Employee id :"+Empid);
	}
	
}

public class Main {  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Empid=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		employee1 obj=new employee1();
  		obj.setEmpid(Empid);
		obj.setName(name);
		System.out.println("Employee Id : "+obj.getEmpid());
		System.out.println("Employee Name : "+obj.getName());
		obj.display();
	}

}
