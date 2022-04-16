/*Allow the inteded users to add a chore, see completion rate,
  see allowance, add allowance, and view a weekly summary*/

import java.util.*;

public class Task {
	static Scanner input = new Scanner(System.in);
	String chore;
	Allowance allowance; 
	static Task task;

	public Task() {
	this.chore = chore;
	this.allowance = new Allowance();
}

public void create() {
	System.out.println("What task do you want to assign your child\n?" 
			+"1.)Washing the dishes"+"2.)Making the bed"+"3.)Fold laundry"+"4.)Custom task"+"5.quit");
	String newT = input.nextLine();
	boolean newChore = true;
	while(newChore) {
		if(newT.equals("1")) {
			this.chore = "Washing Dishes";
			System.out.println("Do you want to give an allownce for this chore, yes or no?");
			String give = input.nextLine();
			if(give.equals("yes")||give.equals("Yes")||give.equals("YES)")){
				task.allowance.quantity();
			}//END NESTED IF
		}//end if
		else if (newT.equals("2")) {
			this.chore = "Making the bed ";
			System.out.println("Do you want to give an allownce for this chore, yes or no?");
			String give = input.nextLine();
			if(give.equals("yes")||give.equals("Yes")||give.equals("YES)")){
				task.allowance.quantity();
			}//END NESTED IF
		}//end if
	}//end while
}//end create

public void addAllowance(){
	System.out.println("Did you want to add to your childs allowance?\n"+"1.)Yes\n"+"2.)No");
	String pchoice = input.nextLine();
	boolean adds = true;
	while(adds) {
		if(pchoice.equals("1")||pchoice.equals("Yes")||pchoice.equals("yes")||pchoice.equals("YES")){
			task.allowance.quantity();
		}//ends if parent wants to add 
		else if(pchoice.equals("2")||pchoice.equals("No")||pchoice.equals("NO")||pchoice.equals("no")) {
			adds = false;
		}//end else if
		else {
			adds = false;
		}//end else
	}//ends while
}


public void completed(){
	System.out.println("Do you want to mark this task as comepleted? Yes or No");
	String done = input.nextLine();
	if(done.equals("Yes")||done.equals("YES")||done.equals("yes")) {
		System.out.println("Task Completed");
	}//end if
	else if(done.equals("No")||done.equals("NO")||done.equals("no")) {
		System.out.println("Task Incomplete");
	} //end else if 
	else {
		System.out.println("Invalid input");
	}
}


public void balance() {
	System.out.println("The current allownce balance is "+task.allowance.viewBalance());
	}//ends balance






}
