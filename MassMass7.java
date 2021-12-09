package by.jonline.tolik.modul_2;

import javax.sound.midi.Soundbank;

// 7. Сформировать квадратную матрицу порядка N по правилу:
//    и подсчитать количество положительных элементов в ней

public class MassMass7 {
public static void main(String [] args) {
	
	int n = 6;
	int count =0;
	double [][] arr =new double [n][n];
	
	for(int i =0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++) {
			
			arr[i][j] = Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/n);
			
			if(arr[i][j]>0) {
				count++;
			}
			
			System.out.print(arr[i][j] +"\t"+"\t"+"\t");
		}
		System.out.println();
		
	}
	System.out.println("количество положительных элементов "+count);
}
}
