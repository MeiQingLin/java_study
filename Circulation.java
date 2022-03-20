package Week02;

public class Circulation {
	public static void main(String[] args) {
		int rowNumber = 1;
		for(int i = 1; i <= 5; i++) {
			int start = rowNumber;
			for(int j = i; j <= 5; j++) {
				System.out.print(start + "\t");
				start = start + j + 1;
			}
			System.out.println();
			rowNumber = rowNumber + i;
		}
	}
}
