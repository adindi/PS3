
public class Tests extends Account {
	public static void main(String[] args){

		
		
		Account testing = new Account(1122, 20000, 4.5);
		
		testing.deposit(3000);
		System.out.println("Balance: $" + testing.getbalance());
		System.out.println("Created on: "+ testing.getdateCreated());
		System.out.println("Monthly interest: $"+ testing.getMonthlyInterestRate());
		try{
		testing.withdraw(2500);
		System.out.println("Balance after drawing $2500: "+ testing.getbalance());
		
		}
		catch (InsufficientFund e){
			System.out.println("You have to deposit $"+ e.getAmount()+ "to be able to draw again");
			e.printStackTrace();
		}
		}

}
