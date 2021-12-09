package by.jonline.tolik.modul_2;

import java.util.Scanner;

// 8. В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца 
//    поставить на соответствующие им позиции другого, а элементы второго переместить в первый. 
//    Номера столбцов вводит пользователь с клавиатуры.

public class MassMass8 {
	
	private static int scanStolb1() {
		Scanner in = new Scanner(System.in);
		System.out.println("введите столбец 1 ");
		int stolbec = in.nextInt();
		return stolbec;
	}
	private static int scanStolb2() {
		Scanner in = new Scanner(System.in);
		System.out.println("введите столбец 2 ");
		int stolbec = in.nextInt();
		return stolbec;
	}
	
	
public static void main(String [] args) {
	
	
	int n = scanStolb1(); // номер первого столбца
	int k = scanStolb2(); // номер второго столбца
	
	int [][] arr = new int [4][4];
	
	for(int i = 0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = j;
			
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	for(int i = 0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = j;
			if(j==n) {
				arr[i][j]=k;
			}
			if(j==k) {
				arr[i][j]=n;
			}
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
}
}
