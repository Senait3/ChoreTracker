/*Allow the inteded users to add a chore, see completion rate,
  see allowance, add allowance, and view a weekly summary*/


import java.util.*;
// Add complete check to allowance
import java.io.Serializable;

public class Task  implements Serializable {
	static Scanner input = new Scanner(System.in);
	static String chore;
	static ArrayList<Task> task = new ArrayList<Task>();
	
	public Task(String chore) {
	this.chore = chore;
	}

public Task(){
		// TODO Auto-generated constructor stub
	}

public static void pTask() {
	//add a task
	System.out.println("Type in the name of the task: ");
	String mom = input.nextLine();
	
}


}
