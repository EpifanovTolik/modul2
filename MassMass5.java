package by.jonline.tolik.modul_2;

// 5. —формировать квадратную матрицу пор€дка n по заданному образцу(n -четное)

public class MassMass5 {

	public static void main(String [] args) {
		
		int n = 8; // n- четное
		
		int [][] arr = new int [n][n];
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j]= i+1;
				if(j>n-1) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j] +"\t");
			}n--;			
			System.out.println();		
		}	
	}
}
