package by.jonline.tolik.modul_2;

import java.util.Arrays;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class MassMass12 {
public static void main(String [] args) {
	
	int [][] arr= { {5,2,7,8},
					{4,9,2,5},
					{2,2,3,5},
					{7,6,8,6}};
	// вывод для наглядности
	for(int i=0;i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	System.out.println();
	// сортировка по возрастанию "вставкой" 
	for(int i=0;i<arr.length; i++) {
	for(int j=1; j<arr[i].length;j++) {
		int current = arr[i][j];
		int k= j-1;
		while(k>=0 && current<arr[i][k]) {
			arr[i][k+1]=arr[i][k];
			k--;
		}
		arr[i][k+1]=current;
	}
}
//	// сортировка пузырьком
//	for(int i=0; i<arr.length; i++) {
//		
//		boolean sorted = false;
//		int temp;
//		while(!sorted) {
//			sorted =true;
//			for(int j=0; j<arr[i].length-1; j++) {
//				if(arr[i][j+1]<arr[i][j]) {
//					temp = arr[i][j];
//					arr[i][j]=arr[i][j+1];
//					arr[i][j+1]=temp;
//					sorted =false;
//				}
//			}
//		}		
//	}
//	// сортировка выбором
//	for(int i=0; i<arr.length; i++) {
//		
//		for(int j=0; j<arr[i].length; j++) {
//			int min = arr[i][j];
//			int pos = j;
//			for(int k=j+1;k<arr[i].length; k++) {
//				if(arr[i][k]<min) {
//					min = arr[i][k];
//					pos = k;
//				}
//			}
//			arr[i][pos] = arr[i][j];
//			arr[i][j]=min;
//		}
//	}
	
	
	//вывод результата
//	System.out.println(Arrays.deepToString(arr));
	
	System.out.println("по возрастанию");
	for(int i=0;i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("по убыванию");
	
	for(int i=0;i<arr.length; i++) {
		for(int j=arr[i].length-1; j>=0; j--) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
}
}
