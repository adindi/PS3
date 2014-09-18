import java.util.Date;


public class Account {
	
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		this.ID = ID;
	}
	public Account(int ID, double balance, double annualInterestRate){
		this.ID = ID;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return balance*((annualInterestRate/100)/12);
	}

	public void withdraw(double amount) throws InsufficientFund{
		if (amount<= balance)
		{
		balance-=amount;
	}
		else
		{
			double needs= amount-balance;
			throw new InsufficientFund(needs);
		}
		}
		public void deposit(double amount)
		{
			balance += amount;
		}

}
