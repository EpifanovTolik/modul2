package by.jonline.tolik.modul_2;

// 11. ������� 10�20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � 
//     ������ ����� , � ������� ����� 5 ����������� ��� � ����� ���.

public class MassMass11 {
public static void main(String [] args) {
	
	int [][] arr= new int [10][20];
	
	int count =0;
	// ���� ������� � ������ �������
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			arr[i][j]=(int) (Math.random() * 16);
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	// ����� ������� �����
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {		
			if(arr[i][j]==5) {
				count++;
			}			
		}
		if(count>=3) {
			System.out.println("����� ������ � �������� >=3 ��� : "+i);
		}
		count =0;
	}	
}
}
