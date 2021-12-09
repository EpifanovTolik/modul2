package by.jonline.tolik.modul_2;

// 13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class MassMass13 {
public static void main(String [] args) {
	
	int [][]arr= {  {8,9,7,8},
					{5,9,6,5},
					{2,2,3,5},
					{7,6,8,6}};
	//начальная матрица
	for(int i=0;i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	
  System.out.println();
	//сортировка выбором
	for(int i=0;i<arr.length;i++) {
		
		for(int j=0; j<arr.length; j++) {
			int min =arr[i][j]; 
			int pos = i;
			for(int k=i+1; k<arr.length; k++ ) {
				if(arr[k][j]<min) {
					min = arr[k][j];
					pos = k;
				}
			}
			arr[pos][j]=arr[i][j];
			arr[i][j]=min;
		}		
	}
	
	
	//сортировка пузырьком
	
//	boolean sorted = false;
//	int temp;
//	while(!sorted) {
//		sorted = true;
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(arr[i+1][j]<arr[i][j]) {
//				temp=arr[i][j];
//				arr[i][j]=arr[i+1][j];
//				arr[i+1][j] =temp;
//				sorted=false;
//			}
//		}	
//	}
//	}
	
	

	// сортировка вставкой
//	for(int i=1;i<arr.length; i++) {
//		for(int j=0; j<arr[i].length;j++) {
//			int current = arr[i][j];
//			int k= i-1;
//			while(k>=0 && current<arr[k][j]) {
//				arr[k+1][j]=arr[k][j];
//				k--;
//			}
//			arr[k+1][j]=current;
//		}
//	}
	System.out.println("по возрастанию");
	// по возрастанию
	for(int i=0;i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
	
	
	System.out.println("по убыванию");
	// по убыванию
	for(int i=arr.length-1;i>=0; i--) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
}
}
