package Week02;

public class PalindromicNumber {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个五位数:");
		int number1 = s.nextInt();
		
		while(number1 > 0) {
			int wan = number1 / 10000 % 10; // 得到万位
			int qian = number1 / 1000 % 10; // 得到千位
			int bai = number1 / 100 % 10; // 得到百位
			int shi = number1 / 10 % 10; // 得到十位
			int ge = number1 % 10; // 得到个位
			int number2 = ge * 10000 + shi * 1000 + bai * 100 + qian * 10 + wan; // 个位与万位互换，十位与千位互换
			if(number2 == number1) {
				System.out.print("该数为回文数!");
			}else {
				System.out.print("该数字不是回文数！");
			}
			break; // 终止本次循环
		}
	}
}
