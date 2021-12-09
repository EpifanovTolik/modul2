package by.jonline.tolik.modul_2;

import java.lang.reflect.Array;

// 4. —формировать квадратную матрицу пор€дка n по заданному образцу (n - четное)

public class MassMass4 {

	public static void main(String [] args) {
		
		int n = 6; // n- четное
		int [][] arr = new int [n][n];
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				for(int j =0; j<arr[i].length; j++) {
					arr[i][j] = j+1;
					System.out.print(arr[i][j] +"\t");
				}
				System.out.println();
			}else {
				// можно так
				
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = n-j;
					System.out.print(arr[i][j] +"\t");
				}
			
				//  или так
				
//				for(int j =arr[i].length-1; j>=0; j--) {
//					arr[i][j]= j+1;
//					System.out.print(arr[i][j] +"\t");
//				}
				System.out.println();
			}
			
		}
		
		
	}
}
