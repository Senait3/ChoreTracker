import java.util.*;
import java.io.Serializable;


public abstract class Allowance implements Serializable{
protected static  double money;
//protected static double amount;
//protected static double take;
static Scanner input = new Scanner(System.in);



public Allowance(double money) {
	this.money = money;
	//this.amount = amount;
	//this.take = take;
}



public Allowance() {
	// TODO Auto-generated constructor stub
	}


/*public  int quantity(){
	boolean cash = true;
	while(cash){
		System.out.println("How much would you like to give for allowance today?\n"+"1.)$1.00\n"+"2.)$5.00\n"+"3.$10.00\n"+"4.)Custom Amount\n"+"5.)Go back");
		String reward = input.nextLine();
		if(reward.equals("1")) {
			this.money = money + 1.00;
			
}

*/ 

	public static void quantity() {
		System.out.println("How much would you like to give for allowance today:$ ");
		double amount =input.nextDouble();
		money = amount + money;
		System.out.println("You gave: "+money);
		
	}	


	
	public static void checkBalance() {
		System.out.println("Current balance is: $"+ money);
		
	}

}//end Allowance class





/*
public static void give() {
	boolean cash = true;
	while(cash) {
		System.out.println("How much would you like to give for allowance today: \n"+"1.)$1.00\n"
				+"2.)$5.00\n"+"3.$10.00\n"+"4.)Custom Amount\n"+"5.)Go back");
		String reward = input.nextLine();
		if(reward.equals("1")) {
			Aamount = 1;
			System.out.println("Current balance is $" + money);
		}//end if 
		else if(reward.equals("2")) {
			Aamount =  5.00 ;
			System.out.println("Current balance is $" + money);
		}//end else if 2
		else if(reward.equals("3")){
			Aamount = 10.00;
			System.out.println("Current balance is $" + money);
		}//end else if 5
		else if(reward.equals("4")){
			System.out.println("How much would you like to give your child?\n"+"$");
			double cents = input.nextDouble();
			Aamount = cents;
			System.out.println("Current balance is $" + money);
		}//end else if custom
		else if (reward.equals("5")) {
			cash = false;
			break;
		}//end quit
		else{
			System.out.println("I am unsure what you want to do, redirecting to main screen");
			System.out.println("Current balance is $" + money);
			cash = false;
			break;
			}//end empty else
	}//end while
	
}



public  double viewBalance() {
	this.money = Aamount + money;
	return money;
}

public static void punish() {
	boolean bad = true;
	while(bad) {
		System.out.println("As punishment how much allowance will you take?\n"+"1.)$1.00\n"
				+"2.)$5.00\n"+"3.$10.00\n"+"4.)Custom Amount\n"+"5.)Go back");
		String punch = input.nextLine();
		if(punch.equals("1")) {
			Aamount = 1;
			System.out.println("Current balance is $" + money);
		}//end if 
		else if(punch.equals("2")) {
			Aamount =  5.00 ;
			System.out.println("Current balance is $" + money);
		}//end else if 2
		else if(punch.equals("3")){
			Aamount = 10.00;
		}//end else if 5
		else if(punch.equals("4")){
			System.out.println("How much would you like to give your child?\n"+"$");
			double cents = input.nextDouble();
			Aamount = cents;
			System.out.println("Current balance is $" + money);
		}//end else if custom
		else if (punch.equals("5")) {
			bad = false;
			break;
		}//end quit
		else{
			System.out.println("I am unsure what you want to do, redirecting to main screen");
			System.out.println("Current balance is $" + money);
			bad = false;
			break;
			}//end empty else
	}//end while
	
}
}//end while*/

