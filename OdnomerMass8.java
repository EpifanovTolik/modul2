package by.jonline.tolik.modul_2;

// 8. ���� ������������������ ����� a1,a2,..an. ���������� ����� ������������������, ��������
//    �� �������� �� ����� , ������� ����� min(a1,a2,..an)
//    ��� ��������� �������� �� ����, ������ ������� �������� �� ����. � ���� ������� ������ ,
//    ��� ��� ����� � ������ �������.

import java.util.Arrays;

public class OdnomerMass8 {
	public static void main(String [] args) {
	
		
		double [] arr = {5,-10,2,-5,0,-5,-10};
		double min = arr[0];
			
		
		for(int i =1; i<arr.length; i++) {
			
			if(arr[i] <= min) {
				min = arr[i];
				arr[i] =0;
			}
			
		}
		System.out.println(min);
		System.out.println(Arrays.toString(arr));

		
	}
}
