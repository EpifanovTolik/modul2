package by.jonline.tolik.modul_2;

// 6. —формировать квадратную матрицу пор€дка n по заданному образцу(n -четное)

public class MassMass6 {
	public static void main(String[] args) {

		int n = 6;

		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			if (i < (arr.length / 2)) {
				for (int j = 0; j < arr[i].length; j++) {

					if (j >= i && j <= (n - 1)) {
						arr[i][j] = 1;
					}
					System.out.print(arr[i][j] + "\t");
				}
				n--;
				System.out.println();
			} else {
				for (int j = 0; j < arr[i].length; j++) {

					if (j >= (n - 1) && j <= i) {
						arr[i][j] = 1;
					}

					System.out.print(arr[i][j] + "\t");
				}
				n--;

				System.out.println();
			}
		}

	}

}
