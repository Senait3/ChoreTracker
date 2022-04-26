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
	Allowance allowance;
	//static ArrayList<String> task = new ArrayList<String>();
	//protected Kid kid;
	static ArrayList<String> kid = new ArrayList <String>();
	static ArrayList<String> parents = new ArrayList<String>();
	static ArrayList<String> message = new ArrayList<String>();



public Parent(String childName) {
	this.childName = childName;
	ArrayList<String> parents = new ArrayList <String>();
	this.allowance = new Allowance();
	//task = new ArrayList<String>();
	ArrayList<String> kid = new ArrayList<String>();
	message = new ArrayList<String>();
	}//end 







/*public static void mom(){
	try {
		FileInputStream fileIn = new FileInputStream("Parent.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		parent = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	
	play();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("Parent.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(parent);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}*/



//}//end parent class

public Parent() {
	// TODO Auto-generated constructor stub
}







public static void mom() {
	
	try {
		FileInputStream fileIn = new FileInputStream("Parent.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		parents = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	/*if(users== null) {
		users = new ArrayList <String>();
	}*/
	
	getStarted();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("Parent.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(parents);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
	
}


public static void getStarted() {
	while (true) {
		System.out.println(
				"\n"
				+"+-----------------------------+\n"
				+"|       Hello Parent!         |\n"
				+"|  Please make a selection!   |\n"
				+"|1.) Add a child              |\n"
				+"|2.) Give Tasks               |\n"
				+"|3.) View task status         |\n"
				+"|4.) Give Allowance           |\n"
				+"|5.) Take allowance           |\n"
				+"|6.) Go to messaging          |\n"
				+"|7.) Quit                     |\n"
				+"+-----------------------------+");
		String in = input.nextLine();
		if(in.equals("1")) {
			newKid();
	}
		else if(in.equals("2")) {
			newChore();
		}
		else if(in.equals("3")) {
			break;
		}
		else if(in.equals("4")) {
			give();
		}
		else if(in.equals("6")){
			System.out.println("hi");
		}
		else if (in.equals("7")) {
			break;
		}
		else if(in.equals("8")) {
			kid.removeAll(kid);
			parents.removeAll(message);
		}
}
	
}
	



public static void newKid() {
	System.out.println("Enter the name of the child you wish to add: ");
	String name = input.nextLine();
	if(kid.contains(name)) {
	System.out.printf("It seems like you've already added that child before\n"+"If thats the case then you can start assigning them tasks\n"
				+"If not then try adding a different child");
	}
	else {
		System.out.printf("Succesfully added: "+name+"\n");
		kid.add(name);
		
	}//end else
}


public static void newChore() {
	for(int i = 0; i < kid.size(); i++) {
	      System.out.print(kid.get(i));
	      System.out.print(" \n");
	    }
	System.out.println("which child did you want to assign a task to: ");
	String bore = input.nextLine();
	if(kid.contains(bore)) {
		Task.addT();
	}
	else {
		System.out.println("Try again");
	}
}


public static void give() {
	System.out.println("which child did you want to give an allowance: ");
	for(int i = 0; i < parents.size(); i++) {
	      System.out.print(kid.get(i));
	      System.out.print(" \n");}
	Allowance.quantity();
}


public static void choreDone() {
	
}
//add task
//add child
//view status
//give money
//take money
//message











}//*}