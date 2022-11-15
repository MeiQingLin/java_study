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
		System.out.println("�û���:" + this.cname);
		System.out.println("�˻�id:" + this.acco.getId());
		System.out.println("�˻����:" + this.acco.getBalance());
		System.out.println("������:" + this.acco.getAnnualInterestRate());
	}
}