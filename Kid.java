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
	static ArrayList<String> task = new ArrayList
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
	ArrayList<String> task;
	message = new ArrayList<String>();

	
}//end 



public static void kidDoes() {
	 try {
			FileInputStream fileIn = new FileInputStream("Parent.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			kid = (ArrayList<String>) in.readObject();
			in.close();
			fileIn.close();
		 
			
		
		}//end try	
		catch(IOException | ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}//end catch
		
		doing();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Parent.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(kid);
			out.close();
			fileOut.close();

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
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
