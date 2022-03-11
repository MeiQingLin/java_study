package Week01;

public class Division {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入一个数字:");
		int a = s.nextInt();
		System.out.print("请再次输入一个数字:");
		int b = s.nextInt();
		
		double c = (double)a / b;
		System.out.print("这两个数相除的结果是:" + c);
		
	}
}
