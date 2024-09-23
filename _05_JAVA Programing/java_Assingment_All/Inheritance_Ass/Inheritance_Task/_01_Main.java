package Inheritance_Task;

 class Account{
	private String accNumber;
	private double balence;
	public Account(String accNumber,double balence) {
		this.accNumber = accNumber;
		this.balence = balence;
	}
	double getbalence() {
		return balence;
	}
	void diposite(double amount) {
		 balence = balence + amount;
		System.out.println("deposite amount : "+ amount);
		System.out.println("Balence After deposite : "+balence);
	}
	void withDraw(double amount) {
		if(this.balence > 100) {
			balence = balence - amount;
			System.out.println("Balence after withdraw : "+balence);
		}
		else {
			System.out.println("Balence is not sufficent");
		}
			}
}
 
 class SavingAcc extends Account{
	 public SavingAcc(String accNumber,double balence) {
		 super(accNumber,balence);
	 }
	 void withdraw(double amount) {
		 super.withDraw(amount); 
		
	 }
	 
	 double addIntrest(double intrest) {
		return  getbalence() * intrest;
	 }
 }
 
public class _01_Main {

	public static void main(String[] args) {
		SavingAcc acc = new SavingAcc("SBIN12334",10000.0);
		System.out.println("Balence befor Diposite : "+acc.getbalence());
       acc.diposite(1000);
      System.out.println("intrest rate of account balence : "+ acc.addIntrest(0.05));
      acc.withdraw(3000);
     
	}

}

/* output :
	Balence befor Diposite : 10000.0
	Balence After Diposite : 11000.0
	intrest rate of account balence : 550.0
	Balence after withdraw : 8000.0
*/	

