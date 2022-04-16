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


  
}
