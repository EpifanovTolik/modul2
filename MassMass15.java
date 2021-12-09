package by.jonline.tolik.modul_2;

//15. Ќайдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class MassMass15 {
public static void main(String [] args) {
	
	int arr[][]= {{5,-2,4,9},{7,-8,5,3},{-2,2,7,7,},{1,2,-3,6}};
	
	int max = arr[0][0];
	System.out.println("начальный массив ");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	// находим max
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}		
		}	
	}
	System.out.println("максимальный элемент "+max);
	// мен€ем на макс нечетные
	System.out.println("измененный массив ");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((arr[i][j])%2 != 0) {
				arr[i][j]=max;
			}			
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}
}
