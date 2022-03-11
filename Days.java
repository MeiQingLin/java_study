package Week01;

public class Days {
	public static void main(String[] args) {
		
		java.util.Scanner number = new java.util.Scanner(System.in);
		
		System.out.print("请输入年份:");
		int year = number.nextInt();
		if(year < 0) {
			System.out.println("您输入的年份不合理！");
			return;
		}
		
		System.out.print("请输入月份:");
		int month = number.nextInt();
		if(month < 0 || month > 12) {
			System.out.println("您输入的月份不合理！");
			return;
		}
		
		if(year % 4 == 0 && month == 2) {
			System.out.println("这一年的这一月一共有29天");
			return;
		}
		
		int day = 30;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		}
		
		System.out.println("这一年的这一月一共有" + day + "天");	
	}
}
