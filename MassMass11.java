package by.jonline.tolik.modul_2;

// 11. Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и 
//     номера строк , в которых число 5 встречается три и более раз.

public class MassMass11 {
public static void main(String [] args) {
	
	int [][] arr= new int [10][20];
	
	int count =0;
	// сама матрица с рандом числами
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			arr[i][j]=(int) (Math.random() * 16);
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	// вывод номеров строк
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			if(arr[i][j]==5) {
				count++;
			}			
		}
		if(count>=3) {
			System.out.println("номер строки с пятеркой >=3 раз : "+i);
		}
		count =0;
	}	
}
}
