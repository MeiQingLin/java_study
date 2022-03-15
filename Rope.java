package Week02;

public class Rope {
	public static void main(String[] args) {
		
		double ropeMeter = 3000; // 绳子长度为3000米
		int day = 0; // 所需的天数
		do {
			ropeMeter /= 2; // 每次循环除以2
			day++; //一次循环过一天
		}while(ropeMeter >= 5); // 当绳子长度大于等于5时，继续循环，直到长度小于5，为假，停止循环
		System.out.print("共需" + day + "天使绳子长度少于5米");
	}
}
