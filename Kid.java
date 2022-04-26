import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Kid extends Allowance implements Serializable {
	static ArrayList<String> kid = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);
	protected String name;
	protected Allowance allowance;
	static ArrayList<String> task = new ArrayList<String>();
	static ArrayList<String> parents = new ArrayList<String>();
	//protected Task task; 
	
	//public static ArrayList<String> kid = new ArrayList<String>();
	ArrayList<String> message = new ArrayList<String>();
	//private Object Task;
	
public Kid(String name, int age) {
	this.name = name;
	ArrayList<String> kid = new ArrayList<String>();
	ArrayList<String> parents = new ArrayList <String>();
	this.allowance = new Allowance();
	ArrayList<String> task = new ArrayList<String>();
	message = new ArrayList<String>();

	
}//end 



public static void kidDoes() {
	try {
		FileInputStream fileIn = new FileInputStream("kid.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		kid = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	/*if(users== null) {
		users = new ArrayList <String>();
	}*/
	
	addnew();	
	Kmenu();
	try {
		FileOutputStream fileOut = new FileOutputStream("kid.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(kid);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
		}
}





	public static void Kmenu() {
		while(true) {
		System.out.println( "+----------------------+\n"+
							"| 1.) View Tasks       |\n"+
							"| 2.) Complete Tasks   |\n"+
							"| 3.) View allowance   |\n"+
							"| 4.) Go to Messaging  |\n"+
							"| 5.) Quit             |\n"+
							"+----------------------+");
		String in = input.nextLine();
		if(in.equals("1")) {
			kidDone();
		}
		else if(in.equals("2")) {
			Task.complete();
		}
		else if(in.equals("3")) {
			
		}
		else if(in.equals("4")) {
			Message.History();
		}
		else if(in.equals("5")) {
			break;
		}
	}
}






public static void addnew() {
	System.out.println("Enter the name of the child you wish to add: ");
	String name = input.nextLine();
	if(kid.contains(name)) {
	System.out.printf("It seems like you've already added that child before\n"+"If thats the case then you can start assigning them tasks\n"
				+"If not then try adding a different child");
	}
	else {
		System.out.printf("Succesfully added: "+name+"\n");
		kid.add(name);
	}
}







public static void kidDone() {
	Task.complete();
}



	public static void doing() {
		System.out.println(parents);
		System.out.println("To get started type in your name: ");
		String kName = input.nextLine();
		if(task.contains(kName)) {
			boolean kiddoes = true;
			while(kiddoes) {
			System.out.println("HI");
			String hi = input.nextLine();
			if(hi.equals("1")){
				Task.pTask();
			}
			else if(hi.equals("2")) {
				Allowance.checkBalance();
					}
			else if(hi.equals("3")) {
				System.out.println(kid);
			}
		}
	}
		else {
			System.out.println("You don't seem to be registered, try having a parent add you so you can get started.");
		}
}
//public 




}//end Kid entire class
