package by.jonline.tolik.modul_2;

import java.util.Arrays;

// 1. Дана матрица. Вывести на экран все нечетные столбцы,
//    у которых первый элемент больше последнего.

public class MassMass1 {
public static void main(String [] args) {
	
	int [][] arr = {{4,4,8,1,6},{3,7,3,2,8}};
	
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j=j+2) {
				
			if(arr[0][j]>arr[1][j]) {
				System.out.print(arr[i][j] + "\t");
			}
				
				
			}
			System.out.println();
		
		}
	
}
}
