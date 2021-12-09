package by.jonline.tolik.modul_2;

// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class MassMass2 {
	public static void main(String[] args) {

		int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println("с левой стороны");
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				
				if(j==i) {
					
					System.out.print(arr[i][j] + "\t");
				}	
			}
			System.out.println();
		}
		
		System.out.println("с правой стороны");
		for(int i =0; i<arr.length; i++) {		
			for(int j =arr[i].length-1; j>=0; j--) {
				
				if(j==(arr[i].length-1)-i) {
					
					System.out.print(arr[i][j] + "\t");
				}
				
			}
			System.out.println();
		}
	}
}
