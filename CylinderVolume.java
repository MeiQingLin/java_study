package Week01;

public class CylinderVolume {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入圆柱体的底半径:");
		double radius = s.nextDouble();
		System.out.print("请输入圆柱体的高:");
		double high = s.nextDouble();
		
		double volume = 3.14 * radius * radius * high;
		
		System.out.print("该圆柱体的体积是:" + volume);
	}
}
