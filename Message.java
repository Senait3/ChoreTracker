<<<<<<< HEAD
/*allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages
*/
/*import java.util.*; 
allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages
=======
/*import java.util.*; 
allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages

public class Message {

}*/
  
import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
    
/*allow the parent anc kid to send messages to eachother, reply to messages, and read messages.
only allow reading for older stored messages
*/
>>>>>>> 2934e3710518abb8e64b528d0ad1320d78db6739

public class Message {
  static Scanner input = new Scanner(System.in);
  ArrayList<String> message = new ArrayList<String>();

public void discussion(){
  boolean talk = true;
  while(talk){
    System.out.println("What would you like to do?\n"+
                      "1.)View Recent Message\n"+
                      "2.)Send a Message\n"+
                      "3.)View all chat history\n"+
                      "4.)Exit");
    String chat = input.nextLine();
    if(chat.equals("1")){
      System.out.printf("Most recent message\n",message.get(-1));
    }//end if
    else if(chat.equals("2")){
      System.out.println(java.time.LocalDate.now()+"Enter a message you would like to send: ");
       message.add(input.nextLine());
    }//end else if
    else if(chat.equals("3")){
      System.out.printf("Message history to date: \n",(message));
    }//end else if 3
    else if(chat.equals("4")){
      talk = false;
    }//end else if quit
    else{
      System.out.println("Invalid input");
      talk = false;
    }//end else 
  }//end while loop
}


<<<<<<< HEAD
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
static Scanner input = new Scanner(System.in);
 static ArrayList<String> message = new ArrayList<String>();
  
  //static Message message; 
  
 
  
 public static void History() {
	 try {
			FileInputStream fileIn = new FileInputStream("Messages.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			message = (ArrayList<String>) in.readObject();
			in.close();
			fileIn.close();
		 
			
		
		}//end try	
		catch(IOException | ClassNotFoundException c) {
			System.out.println("No recent messages");
		}//end catch
		
		discussion();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("Messages.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(message);
			out.close();
			fileOut.close();

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
 } 
  
  
  
public static void discussion(){
	boolean talk = true;
	while(talk){
		System.out.println("\nWhat would you like to do?\n"+
                      "1.)View Recent Message\n"+
                      "2.)Send a Message\n"+
                      "3.)View all chat history\n"+
                      "4.)Exit");
	    String chat = input.nextLine();
	    if(chat.equals("1")){
	      System.out.printf("Most recent message\n"+message.get(message.size() - 1));
	    }//end if
	    else if(chat.equals("2")){
	      System.out.println(java.time.LocalDate.now() + " Enter a message you would like to send: ");
	      String speak = input.nextLine();
	      message.add(speak);
	    }//end else if
	    else if(chat.equals("3")){
	      //System.out.printf("Message history to date: \n");
	    	  System.out.printf("Message history to date: \n");
	    		  System.out.print(message);
	    }//end else if 3
	    else if(chat.equals("4")){
	      talk = false;
	    }//end else if quit
	    else{
	      System.out.println("Invalid input");
	      talk = false;
	    }//end else 
	  }//end while loop
	}
	
	
	  
=======
  
>>>>>>> 2934e3710518abb8e64b528d0ad1320d78db6739
}
