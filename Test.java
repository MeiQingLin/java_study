public class Test{
	public static void main(String[] args){
		Account acco1 = new Account("1000", 2000, 1.23);
		Customer cus1 = new Customer("Jane Smith", acco1);
		// 通过客户一步步去取款，存款操作，符合业务逻辑
		// 如果直接通过账户去存款取款，不符合逻辑
		// 例如:
		// acco1.deposit(100);
		// acco1.withdraw(960);
		// acco1.withdraw(2000);

		cus1.print();
		cus1.getAcco().deposit(100);
		cus1.getAcco().withdraw(960);
		cus1.getAcco().withdraw(2000);
		cus1.print();
	}
}