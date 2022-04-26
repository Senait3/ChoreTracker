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
	static ArrayList<String> complete = new ArrayList<String>();
	

	
	public Task(String chore) {
		ArrayList<String> complete = new ArrayList<String>();
		ArrayList<String> task = new ArrayList <String>();
		this.chore = chore; 
	}
	
	

public static void work() {	
	try {
		FileInputStream fileIn = new FileInputStream("task.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		task = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	/*if(users== null) {
		users = new ArrayList <String>();
	}*/
	addT();
	complete();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("task.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(task);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
		}
}


public static void assigned() {
	System.out.println("Here are all the assigned tasks");
	for(int i = 0; i < task.size(); i++) {
	      System.out.print(task.get(i));
	      System.out.print(" \n");
	    }
}
	
	
public static void addT() {
	System.out.println("What is the name of the task: ");
	String chore = input.nextLine();
	task.add(chore);
	if(task.isEmpty()) {
		task.add(chore);
	}
	else {
		System.out.println("You have created the task' " + task.get(task.size() - 1)+"'");
	}
	
}	
	
	
public static void complete() {
	for(int i = 0; i < task.size(); i++) {
	      System.out.print(task.get(i));
	      System.out.print(" \n");}
	System.out.println("What task do you want to mark as complete: ");
	String fini = input.nextLine();
	System.out.println("Are you sure you want to mark that task as complete?(y/n)");
	String sure = input.nextLine();
	if(sure.equals("y")||sure.equals("Y")) {
		complete.add(fini);
		System.out.print("Succesfully marked complete\n");
	}
	else if(complete.isEmpty()) {
		System.out.println("Okay come back later, and complete your tasks");
	}
}

public static void pTask() {
	//add a task
	if(complete.isEmpty()) {
		System.out.println("There aren't any completed tasks currently");
	}
	System.out.println("Tasks Status: "+complete);
		
}



}

