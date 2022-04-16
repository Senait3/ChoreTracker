import java.util.*;

public class Parent {
//String FamilyName;
	static Scanner input = new Scanner(System.in);
	protected String FamilyName;
	protected int age;
	protected Allowance allowance;
	protected Task task; 
	//protected Kid kid;
	ArrayList<Kid> kid = new ArrayList <Kid>();



public Parent(String FamilyName, int age) {
	this.FamilyName = FamilyName;
	this.age = age;
	this.allowance = new Allowance();
	this.task = new Task();
	kid = new ArrayList<Kid>();
	}//end 



public Parent() {
	// TODO Auto-generated constructor stub
}
}//end parent class