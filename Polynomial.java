package Week02;

public class Polynomial {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入多项式的项数:");
		int n = s.nextInt();
		double sum1 = 0;
		
		for(int i = 1; i <= n; i++) {
			double di = 1;
			for(int k = 1; k <= i; k++) {
				di *= k;
			}
			sum1 += Math.pow(-1, i - 1) / di;
		}
		System.out.print("该多项式的值是:" + sum1);
	}
}
