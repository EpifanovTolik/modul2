package by.jonline.tolik.modul_2;

import java.util.Arrays;

// ���������� �������. ���� ������������������ ����� a1<=a2<=..<=an. ��������� 
// ����������� �������� ���, ����� ��� ���� ����������� �� ��������. ��� �����
// � ������� , ������� � �������, ���������� ���������� ������� � �������� �� ������
// �����, � ������ �� ����� �����������. �����, ������� �� �������, ��� ��������� 
// �����������. �������� �������� ���������� �������.

public class OdnomerSort3 {
public static void main(String[]args) {
	
	int [] arr = {2,3,4,5,6,7,8,9};
	
	for(int i=0; i<arr.length; i++) {
		int max = arr[i];
		int pos = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j]>max) {
				max=arr[j];
				pos=j;
			}
		}
		arr[pos]=arr[i];
		arr[i]=max;
	}
	System.out.println(Arrays.toString(arr));	
}
}
