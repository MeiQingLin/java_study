public class Account{
	private String id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){
	}
	public Account(String id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	// setter and getter
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}

	// ȡ���
	public void withdraw(double money){
		// this.balance -= money;
		// this.balance = this.balance - money;
		// this.balance = getBalance() - money;
		if(money > getBalance()){
			System.out.println("���㣬�޷�ȡ��");
			return;
		}
		setBalance(getBalance() - money);
		System.out.println("�ɹ�ȡ��:" + money);
	}
	//����
	public void deposit(double money){
		//ͬ��
		setBalance(getBalance() + money);
		System.out.println("�ɹ�����:" + money);
	}
}	