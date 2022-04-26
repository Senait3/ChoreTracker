/*allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages
*/
/*import java.util.*; 
allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages

public class Message {

}*/
import java.util.ArrayList; 
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
    
/*allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages
*/

public class Message implements Serializable {
  //private static final long serialVersionUID = 1L;
	protected String text;
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> message = new ArrayList<String>();

  //static Message message; 
  
 public void message() {
	 ArrayList<String> message = new ArrayList<String>();
	 this.text = text;
 }
  
  
  
 public static void History() {

	 try {
			FileInputStream fileIn = new FileInputStream("Messages.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			message = (ArrayList<String>) in.readObject();
			in.close();
			fileIn.close();
		 
			
		
		}//end try	
		catch(IOException | ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}//end catch
		
		discussion();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Messages.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(message);
			out.close();
			fileOut.close();

		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	 
 } 
  
  
  
public static void discussion(){
		while(true) {
		System.out.println("\nWhat would you like to do?\n"+
                      "1.)View most recent message\n"+
                      "2.)Send a Message\n"+
                      "3.)Delete Message History\n"+
                      "4.)Exit");
	    String chat = input.nextLine();
	    if(chat.equals("1")){
	    if(message.isEmpty()) {
	    		System.out.println("There does not seem to be any messages, please send one before viewing");
	    	}
	    else{ //(message.contains(message)) {
		    System.out.printf("Most recent message: "+message.get(message.size() - 1));
		    }
	     
	    }//end if
	    else if(chat.equals("2")){
	      System.out.println(java.time.LocalDate.now() + " Enter a message you would like to send: ");
	      String text = input.nextLine();
	      message.add(text);
	    }//end else if
	    else if(chat.equals("3")){
	    	message.removeAll(message);
	    }//end else if quit
	    else if(chat.equals("4")) {
	    	System.out.println("Bye-bye");
	    	break;
	    }
	    else if(chat.equals("5")) {
	    	message.removeAll(message);
	    	for (int i = 0; i < message.size(); i++)
	    		System.out.println(message.get(i));
	    }
	    else{
	      System.out.println("Invalid input");
	      //break;
	    }//end else 
	  }//end while loop
	}
	
	
	  
}
