package Week01;

public class Max {
	public static int max(int x, int y) {
		return x > y ? x : y;
	} // 自己定义的方法，用于比较两数中谁大
	public static void main(String[] args) {
		java.util.Scanner number = new java.util.Scanner(System.in);
		
		System.out.print("请您输入第一个数字:");
		int number_1 = number.nextInt();
		System.out.print("请您输入第二个数字:");
		int number_2 = number.nextInt();
		System.out.print("请您输入第三个数字:");
		int number_3 = number.nextInt(); // 用户输入的3个数字
		
		
		int maximum = max(number_1, max(number_2, number_3)); // maximum为三个数中最大的那个值
		System.out.println("您输入的最大数字是:" + maximum); // 打印输出最大数
	}
}
