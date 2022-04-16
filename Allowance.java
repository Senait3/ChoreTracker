import java.util.*;

public class Allowance {
protected double money = 0.00;
protected double Aamount = 0.00;
static Scanner input = new Scanner(System.in);



public Allowance() {
	this.money = money;
	this.Aamount = Aamount;
}






public void quantity() {
	boolean cash = true;
	while(cash){
		System.out.println("How much would you like to give for allowance today?\n"+"1.)$1.00\n"+"2.)$5.00\n"+"3.$10.00\n"+"4.)Custom Amount\n"+"5.)Go back");
		String reward = input.nextLine();
		if(reward.equals("1")) {
			this.Aamount = 1.00 + Aamount;
		}//end if
		else if(reward.equals("2")) {
			this.Aamount = 5.00 + Aamount;
		}//end else if 2
		else if(reward.equals("3")){
			this.Aamount = 10.00  + Aamount;
		}//end else if 5
		else if(reward.equals("4")){
			System.out.println("How much would you like to give your child?\n"+"$");
			double cents = input.nextDouble();
			this.Aamount = cents + Aamount;
		}//end else if custom
		else if (reward.equals("5")) {
			cash = false;
		}//end quit
		else{
			System.out.println("I am unsure what you want to do, redirecting to main screen");
			cash = false;
			}//end empty else
	}//end while
	
}//end quantity

public void addMoney(){
	quantity();
	this.money = money + Aamount;
}

public double viewBalance() {
	return this.money;
}



}//end allowance class

