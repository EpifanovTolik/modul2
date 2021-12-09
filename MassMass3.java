package by.jonline.tolik.modul_2;

import java.util.Scanner;

// 3. Дана матрица. Вывести к-ю строку и р-й столбец матрицы.

public class MassMass3 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int k = 3; // строка выбрать
		int p = 1; // столбец выбрать
// для строки
		System.out.println("строка ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i == k) {
					System.out.print(arr[i][j] + "\t");
				}
			}
		}
		System.out.println();
// для столбца
		System.out.println("столбец");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (j == p) {

					System.out.println(arr[i][j]);
				}
			}
		}

	}
}
