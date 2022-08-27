package ATM_MACHINE_PROJECT;

public class Atm_Machine {

		
//		ATM M/C PROJECT IN JAVA
		
//		1.VALIDATE The user through ATM Number and PIN.
//		2.User Should Be Able To Perform Below Operations.
//						1.Check Available Balance
//						2.Withdraw Amount
//						3.Deposit Amount
//						4.View Mini Statement
//						5.Exit

	
	private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
  
    public Atm_Machine(){

    }

    //getter setter methods 
  
public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

}
