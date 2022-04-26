import java.io.*;
import java.io.Serializable;
import java.util.*;
import java.util.ArrayList; 



public class User implements Serializable {
	//private static final long serialVersionUID = 5594123735977410396L;
	protected String username;
	protected String password;
	static ArrayList<String> parent = new ArrayList<String>();
	static ArrayList<String> kid = new ArrayList<String>();
	static ArrayList<String> users = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);
	

public  User(String username,String password) {
	this.username = "username";
	this.password = "password";
	ArrayList<String> kid = new ArrayList <String>();
	ArrayList<String> parent = new ArrayList <String>();
	ArrayList<User> users = new ArrayList<User>();
	}


public static void main(String [] args) {
	System.out.println("+-----------------------------------+\n"
			  +"|                                   |\n"
			  +"| Hello Welcome to atomic household |\n"														
			  +"|     For the Nuclear family        |\n"						
			  +"|                              	    |\n"
			  +"+-----------------------------------+\n"
	);
	try {
		FileInputStream fileIn = new FileInputStream("Users.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		users = (ArrayList<String>) in.readObject();
		in.close();
		fileIn.close();
	 
		
	
	}//end try	
	catch(IOException | ClassNotFoundException c) {
		System.out.println(c.getMessage());
	}//end catch
	/*if(users== null) {
		users = new ArrayList <String>();
	}*/
	
	enter();
	
	try {
		FileOutputStream fileOut = new FileOutputStream("Users.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(users);
		out.close();
		fileOut.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		

	}
	


	public static void enter() {
		while(true) {
		System.out.println("Please make a selection\n"
				+"1.)Log in\n"
				+"2.)New User sign up\n"
				+"3.)Quit\n");
		String open = input.nextLine();
		if(open.equals("1")) {
			login();
		}
		else if(open.equals("2")) {
			register();
		}
		else if(open.equals("3")) {
			break;
		}
		else if(open.equals("4")) {
			users.removeAll(users);
			//System.out.println("Username and Password: "+(users));
		}
	}
}



	public static void login() {
		
		/*System.out.println("Please make a selection\n"
					+"1.)Log in\n"
					+"2.)New User sign up\n"
					+"3.)Quit\n");
			String open = input.nextLine();
			if(open.equals("1")) {*/
				boolean enter = true;
				while(enter){ 
				System.out.println("Enter your username");
				String username = input.nextLine();
				System.out.println("Enter your password");
				String password = input.nextLine();
				if(users.contains(username)&&users.contains(password)) {
					System.out.println("Log in Succcessful!\nWho are you?\n"
							+"1.) Parents Log-in\n"
							+"2). Kids ");
					String who = input.nextLine();
					if(who.equals("1")) {
						System.out.println("Please enter your pin: ");
						String digit = input.nextLine();
						if(users.contains(digit)) {
							System.out.println("Succesfully Logged you in!");
							//Message.History();
							Parent.mom();
							enter = false;
							
						}
						else {
							System.out.println("Incorrect input, please try again or make a new account");
							enter = false;
						}
					}
					else if(who.equals("2")) {
					Kid.Kmenu();
					}//end else if
				}
				else {
					System.out.println("Unable to log in. Please try again or create a new account");
					enter = false;
				}
			}
		}	
	
			//else if(open.equals("2")) {
				//boolean makeacc =true;
				//while(makeacc) {
					
		public static void register() {
			System.out.println("Hello, Please fill out the inforation below.\n");
					System.out.println("Enter a Username: \n");
					String username = input.nextLine();
					System.out.println("Enter a Password: \n");
					String password = input.nextLine();
					if(users.contains(username)) {
			
					System.out.println("Username is taken, Please try another one\n");
					}	
					else {
						System.out.println("Successfully created your account!\n");
						users.add(username);
						users.add(password);
						System.out.println("Enter a  pin for your accesss");
						String digit = input.nextLine();
						users.add(digit);
						/*System.out.println("Enter a 4-digit pin for your children to access their accounts.");
						String kdigit = input.nextLine();
						users.add(kdigit);
						System.out.println("Succesfully created you and your childs account! refresh the page and log in.");*/
						
						}//END PPIN	
					//}	
					
				}
			/*else if(open.equals("3")) {
				//break;
			}
			else if(open.equals("4")) {
				users.removeAll(users);
				//System.out.println("Username and Password: "+(users));
			}
				
			}*/
	}		
			/*\else if(open.equals("2")) {
				boolean newacc = true;
				while(newacc) {
				System.out.println("Hello, Please fill out the information below.\n");
				System.out.println("Enter a username: ");
				String username = input.nextLine();
				System.out.println("Enter a Password");
				if(user.contains(username));{
					System.out.println("Username Not Available please try another one");
				}
				else if(user.) {
					System.out.println("Account sucsessfully created!");
				}
			}
		}
	}*/
//}//end starting function





















