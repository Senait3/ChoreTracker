import java.util.*;
import java.io.Serializable;

public class Kid extends Allowance implements Serializable {
	static Scanner input = new Scanner(System.in);
	protected String name;
	protected int age;
	protected Allowance allowance;
	//protected Task task; 
	static ArrayList<String> kid = new ArrayList<String>();
	ArrayList<Task> task = new ArrayList <Task>();
	ArrayList<String> message = new ArrayList<String>();
	//private Object Task;
	
public Kid(String name, int age) {
	this.name = name;
	this.age = age;
	this.allowance = new Allowance();
	task = new ArrayList<Task>();
	message = new ArrayList<String>();
	//this.FamilyName = FamilyName;
	this.age = age;
	//this.message = new Message();
}//end 

public Kid() {
	// TODO Auto-generated constructor stub
}

public void doing() {
	//Task.completed();
	System.out.println("HI");
	String hi = input.nextLine();
	if(hi.equals("1")){
		this.checkBalance();
	}
	else if(hi.equals("2")) {
		this.quantity();;
			}
}

//public 




}//end Kid entire class