import java.io.*;
import java.io.Serializable;
import java.util.*;
import java.util.ArrayList; 

public class Parent extends Allowance implements Serializable{
//String FamilyName;
	static Scanner input = new Scanner(System.in);
	static String childName = "";
	int pin = 0;
	Allowance allowance;
	static ArrayList<Task> task = new ArrayList<Task>();
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
	System.out.println("Hello! To get started please type in the name of your child: ");
	String name = input.nextLine();
	if(kid.contains(name)) {
		System.out.printf("It seems like you've already added that child before\n"+"If thats the case then you can start assigning them tasks\n"
					+"If not then try adding a different child");
		}
		else {
			System.out.printf("Succesfully added: "+name);
			kid.add(name);
		}//end else
	boolean ins =true;
		while(ins){
		System.out.println(
						"\n"
						+"+-----------------------------+\n"
						+"|       Hello Parent!         |\n"
						+"|  Please make a selection!   |\n"
						+"|1.) Add a task               |\n"
						+"|2.) View completed tasks     |\n"
						+"|3.) Give Allowance           |\n"
						+"|4.) Take allowance           |\n"
						+"|5.) Go to messaging          |\n"
						+"|6.) Quit                     |\n"
						+"+-----------------------------+");
		String in = input.nextLine();
		if(in.equals("2")) {
			System.out.print("Which child did you want to assign a task to?\n"+(kid));
			for (int i = 0; i < i; i++) {
				System.out.println(i+"\n");
			}
		}
		else if(in.equals("3")) {
			Parent.quantity();
			
			//Task.due();
		}
		}	
	}
}