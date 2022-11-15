public class Customer{
	private String cname;
	private Account acco;
	
	public Customer(){
	}
	public Customer(String cname, Account acco){
		this.cname = cname;
		this.acco = acco;
	}

	// setter and getter
	public void setCname(String cname){
		this.cname = cname;
	}
	public String getCname(){
		return this.cname;
	}

	public void setAcco(Account acco){
		this.acco = acco;
	}
	public Account getAcco(){
		return this.acco;
	}
	public void print(){
		System.out.println("用户名:" + this.cname);
		System.out.println("账户id:" + this.acco.getId());
		System.out.println("账户余额:" + this.acco.getBalance());
		System.out.println("年利率:" + this.acco.getAnnualInterestRate());
	}
}