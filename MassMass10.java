package by.jonline.tolik.modul_2;

// 10. Ќайти положительные элементы главной диагонали квадратной матрицы.

public class MassMass10 {
public static void main (String [] args) {
	
	int [][] arr = {{2,2,3,-4},
					{5,-5,5,5},
					{-6,6,-6,6},
					{7,-7,7,7}};
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			System.out.print(arr[i][j]+"\t");		
		}
		System.out.println();
	}
	System.out.println("положительные элементы диагонали : ");
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			
			if(j==i && arr[i][j]>0) {
				System.out.println( arr[i][j]);
			}
			
		}	
	}
}
}
