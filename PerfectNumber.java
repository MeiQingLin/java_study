package Week02;

public class PerfectNumber {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个整数:");
		int number = s.nextInt();
		
		//定义一个变量去接收因数的和
		int sum = 0; 
		
		//用循环去找出键盘输入的数的因数
		for(int i = 1; i < number; i++) {
			if(0 == number % i) {
				sum += i;
			}
		}
		
		//判断因数和是否与number的值相等，若相等，则为完全数。(数本身不计算在因数和之内)
		if(sum == number) {
			System.out.println("该数字为完全数");
		}else {
			System.out.println("该数字不是完全数");
		}
	}
}
