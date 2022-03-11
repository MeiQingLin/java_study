package Week01;

public class Grade {
	public static void main(String[] args) {
		System.out.print("请输入您的成绩:");
		java.util.Scanner number = new java.util.Scanner(System.in);
		
		double score = number.nextDouble();
		String grade;
		
		if(score < 0 || score > 100) {
			System.out.println("您输入的成绩不合法哦!");
			return;
		}
		grade = "不及格";
				
		switch((int)(score / 10)) {
		case 10: case 9:
			grade = "优";
			break;
		case 8:
			grade = "良";
			break;
		case 7:
			grade = "中";
			break;
		case 6:
			grade = "及格";
			break;
		}
		System.out.println("您的成绩是" + grade + "!");
		
		
	}
}