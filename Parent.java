import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Parent extends Allowance implements Serializable{
//String FamilyName;
	static Scanner input = new Scanner(System.in);
	static String childName = "";
	int pin = 0;
	Allowance allowance;
	ArrayList<Task> task = new ArrayList<Task>();
	//protected Kid kid;
	static ArrayList<String> kid = new ArrayList <String>();
	static ArrayList<String> parent = new ArrayList<String>();
	static ArrayList<Message> message = new ArrayList<Message>();



public Parent(int pin, String childName) {
	this.pin = pin;
	this.childName = childName;
	this.allowance = new Allowance();
	task = new ArrayList<Task>();
	kid = new ArrayList<String>();
	message = new ArrayList<Message>();
	}//end 



public Parent() {
	// TODO Auto-generated constructor stub
}




public static void mom(){
	try {
		FileInputStream fileIn = new FileInputStream("parent.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		parent = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println("No recent messages");
	}//end catch
	
	play();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("parent.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(parent);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}



//}//end parent class





public  static void play(){
	System.out.println("+-----------------------------+\n"
					+  "|       Hello Parent!         |\n"
					+  "|  Please make a selection!   |\n"
					+  "|1.) Add a child              |\n"
					+  "|2.) Add a task               |\n"
					+  "|3.) View completed tasks     |\n"
					+  "|4.) Give Allowance           |\n"
					+  "|5.) Take allowance           |\n"
					+  "|6.) Go to messaging          |\n"
					+  "|7.) Quit 					  |\n"
					+  "+-----------------------------+");
	String in = input.nextLine();
	if(in.equals("1")) {
		System.out.println("Enter your childs name: ");
		String kidName = input.nextLine();
		childName =  kidName;
		System.out.printf("Succesfully added: "+kidName , kid.add(kidName));
		System.out.print(kid);
	}
	else if(in.equals("2")) {
		//Allowance.quantity();
	}
}
}