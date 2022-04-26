/*Allow the inteded users to add a chore, see completion rate,
  see allowance, add allowance, and view a weekly summary*/


import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// Add complete check to allowance
import java.io.Serializable;

public class Task  implements Serializable {
	static Scanner input = new Scanner(System.in);
	static String chore;
	static ArrayList<String> task = new ArrayList <String>();
	static String complete ;
	

	
	public Task(String chore, String complete) {
		ArrayList<String> task = new ArrayList <String>();
		this.chore = chore; 
		this.complete = "incomplete";

	}
	
	

public static void work() {	
	try {
		FileInputStream fileIn = new FileInputStream("Tasks.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		task = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	
	if(task== null) {
		task = new ArrayList <String>();
		System.out.print("No tasks currently assigned");
	}
	addT();
	try {
		FileOutputStream fileOut = new FileOutputStream("Tasks.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(task);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
	
	
	
public static void addT() {
	System.out.println("which child did you want to give an allowance: ");
	String ktname = input.nextLine();
	System.out.println("What is the name of the task: ");
	String chore = input.nextLine();
	task.add(ktname);
	task.add(chore);
	if(task.isEmpty()) {
		task.add(chore);
	}
	else {
		System.out.println("You have created the task' " + task.get(task.size() - 1)+"'");
	}
	
}	
	
	
	

public static void pTask() {
	//add a task
	System.out.println("Tasks Status: "+task);
		
	}
}


/*public static void due() {
	System.out.println("All of your assigned tasks: " + (task));
	
}

public static void KTask() {
	
	System.out.println("Which task did you want to do: ");
}

public static void viewDone() {
	System.out.println("All the completed tasks: "+task.equals("Completed"));
}
*/

