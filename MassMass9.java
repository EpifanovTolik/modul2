package by.jonline.tolik.modul_2;

// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//    Определить какой столбец содержит максимальную сумму.

public class MassMass9 {
public static void main(String [] args ) {
	
	
	int sum = 0;
	int max =0;
	
	int [][] arr = {{10,2,3,4},
					{5,5,5,5},
					{7,7,7,7},
					{3,3,3,3}};
	// просто вывод матрицы для наглядности
	for(int i=0; i<arr.length; i++) {
		for(int j=0;j<arr[i].length;j++) {	
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	// вывод суммы элементов
	for(int i=0; i<arr.length; i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			sum = sum +arr[j][i];
			if(sum>max) {
				max=sum;
			}
		}
		System.out.print(sum+"\t");	
		sum=0;		
	}
	System.out.println("max = "+max);
	
}
}
