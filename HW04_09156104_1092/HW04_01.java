//資一A 09156104 朱可棠
package HW04_09156104_1092;


public class HW04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 代入data fields的值
		Account a = new Account(1122, 20000);
		a.withdraw(2500);
		a.deposit(3000);
		a.setannualInterestRate(4.5);
		// 輸出
		System.out.println("Balance is " + a.getbalance());
		System.out.println("Monthly interest is " + a.getMonthlyInterest());
		System.out.println("This account was created at " + a.getdateCreated().toString());
		//System.out.println("Balance is " + new Account(1122,20000).getbalance());

	}
}

//創一個class 為Account
class Account {
	// data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();

	// 創一個沒有參數的constructor
	public Account() {
	}

	// 創另一個constructor
	public Account(int newid, double newbalance) {
		id = newid;
		balance = newbalance;
	}

	// data fields的getter method和setter method
	public int getid() {
		return id;
	}

	public void setid(int newid) {
		id = newid;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double newbalance) {
		balance = newbalance;
	}

	public double getannualInterestRate() {
		return annualInterestRate;
	}

	public void setannualInterestRate(double newannualInterestRate) {
		annualInterestRate = newannualInterestRate;
	}

	public java.util.Date getdateCreated() {
		return dateCreated;
	}

	// 計算monthly interest rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}

	// 計算monthly interest
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	// 計算balance (balance-withdraw +deposit)
	public void withdraw(int newwithdraw) {
		balance -= newwithdraw;
	}

	public void deposit(int newdeposit) {
		balance += newdeposit;
	}
}
