/*Allow the inteded users to add a chore, see completion rate,
  see allowance, add allowance, and view a weekly summary*/


import java.util.*;
// Add complete check to allowance
import java.io.Serializable;

public class Task  implements Serializable {
	static Scanner input = new Scanner(System.in);
	static String chore;
	static ArrayList<String> task = new ArrayList<String>();
	static String complete ;
	public Task(String chore) {
	this.chore = chore;
	}

	
	public Task(String chore, String complete) {
		this.chore = chore; 
		this.complete = "incomplete";
	}
	


public static void pTask() {
	//add a task
	System.out.println("1.)Add a task\n"+"2.)View all completed tasks");
	String pick = input.nextLine();
	if(pick.equals("1")) {
		
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
}
