package by.jonline.tolik.modul_2;

import java.util.Arrays;

// 14. ������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ ������� 
//     ����� ������ ����� ������ �������.

public class MassMass14 {
public static void main (String [] args) {
	
	int [][] arr = new int [6][6];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			if(j>=i) {			 
					arr[i][j]=1;	
			}					
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}

}
}
