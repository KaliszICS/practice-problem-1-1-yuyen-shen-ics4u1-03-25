public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sum2D(new int[][] {{2, 3, 5}, {7, 4, 9}}));
		System.out.println(sumRow(new int[][] {{2, 3, 5}, {7, 4, 9}, {1, 5, 8}}, 0));
		System.out.println(sumColumn(new int[][] {{2, 3, 5}, {7, 4, 9}, {1, 5, 8}}, 0));
	}

	public static int sum2D(int[][] array2D) {
		//Write question 1 code here
		int sum = 0;
		for (int row = 0; row < array2D.length; row++) { //rows
			for (int col = 0; col < array2D[row].length; col++) {
				sum = sum + array2D[row][col];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] array2D2, int rowNum) {
		//Write question 2 code here
		int sum2 = 0;
		for (int col2 = 0; col2 < array2D2[rowNum].length; col2++) {
			sum2 = sum2 + array2D2[rowNum][col2];
		}
		return sum2;
	}

	public static int sumColumn(int[][] array2D3, int colNum) {
		//Write question 3 code here
		int sum3 = 0;
		for (int row2 = 0; row2 < array2D3.length; row2++) {
			sum3 = sum3 + array2D3[row2][colNum];
		}
		return sum3;
	}

}
