package by.jonline.tolik.modul_2;

import java.util.Arrays;

// ���������� ���������. ���� ������������������ ����� a1,a2,..,an. ��������� 
// ����������� ����� � ������� �����������. �������� ��� ��������� �������. ����� 
// a1,a2,..,ai ������������� ������������������ , �.�. a1<=a2<=..<=an. ������� 
// ��������� ����� ai+1  � ����������� � ������������������ ���, ����� ����� 
// ������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� 
// ��� �������� �� i+1 �� n �� ����� ���������. ����� ��������� ���������� ��������
// � ��������������� ����� ����������� � ������� ��������� ������. �������� �����
// �������� � ���� ��������� �������.

// ��� ���� ������������ �������� ����� �� ����������

public class OdnomerSort5 {

	public static void main(String[] args) {
		
		int [] arr= {4,9,6,5,8};
		
	
		for(int i=1; i<arr.length; i++) {
					
			int current =arr[i];	
			int j=i-1;
			
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=current;				
		}
System.out.println(Arrays.toString(arr));
	}
	
//	static int binarySearch(int arr[], int start, int end, int elem) {
//
//		int mid = start + (end - start) / 2;
//
//		if(elem==arr[mid]) {
//			return mid;
//		}
//		if (elem < arr[start]) {
//			return -1;
//		}
//		if (elem > arr[end]) {
//			return end;
//		}
//		if (arr[mid] < elem && elem <= arr[mid + 1]) {
//			return mid;
//		}
//		if (arr[mid] > elem) {
//			return binarySearch(arr, start, mid - 1, elem);
//		}
//		return binarySearch(arr, mid + 1, end, elem);
//	
//    }
}
