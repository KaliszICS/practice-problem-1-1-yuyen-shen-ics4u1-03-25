
class Notes {
	public static void main(String[] args) {

		//Array (1D Array)

		int[] intArray = new int[52]; //filled with default values
		int[] intArray2 = {1, 4, 6};

		//2D Array

		int[][] intArray2D = new int[25][10]; //25 rows, 10 columns
		int[][] intArray2D2 = {
			{1, 3, 5},
			{2, 4, 6, 8},
			{3, 6, 9}
		};

		//iterate over a 2D array

		for (int row = 0; row < intArray2D2.length; row++) { //rows
			for (int col = 0; col < intArray2D2[row].length; col++) { //cols
				System.out.print(intArray2D2[row][col] + " ");
			}
			System.out.println(); //move down a line after finishing a row
		}
		System.out.println();

		//enhanced for loop - designed for reading, not for writing

		for (int[] row : intArray2D2) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
