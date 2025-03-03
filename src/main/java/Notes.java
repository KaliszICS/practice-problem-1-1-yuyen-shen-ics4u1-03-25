
class Notes {
	public static void main(String[] args) {

		int[] intArray = new int[25];
		int[] intArray2 = { 1, 4, 6 };

		// 2-D Arrays

		int[][] intArray2D = new int[5][10]; // NUMBER OF ROWS, NUMBER OF COLUMNS
		int[][] intArray2D2 = {
				{ 1, 3, 5 },
				{ 2, 4, 6 },
				{ 3, 5, 6 }
		};

		// iterating

		// 1-D
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		// 2-D
		for (int i = 0; i < intArray2D2.length; i++) { // i is a row
			for (int j = 0; j < intArray2D2[i].length; j++) { // j is a column
				System.out.print(intArray2D2[i][j] + " "); // use print instead of println to keep all columns on the
															// same row.
			}
			System.out.println(); // go down a line after each row prints
		}
	}
}
