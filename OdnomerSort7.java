package by.jonline.tolik.modul_2;

import java.util.Arrays;

// ����� ���� ��� ����������� ������������������ �������������� ����� a1<=a2<=..<=an
// � b1<=b2<=..<=bm . ��������� ������� �� �����, �� ������� ����� ��������� ��������
// ������������������ b1<=b2<=..<=bm � ������ ������������������ ���, ����� ����� 
// ������������������ ���������� ������������.

public class OdnomerSort7 {
	public static void main(String[] args) {
		
		int [] arr1 = {2,4,6,8,10,12};
		int [] arr3 = {7,9,10,11,13,14};
		
		int[] arr = new int[arr3.length];
		int n;

		for (int j = 0; j < arr3.length; j++) {
			n = binarySearch(arr1, 0, arr1.length - 1, arr3[j]);
			arr[j] = n + j + 1;
		}

		System.out.println("� ������ ���������� ��������� ������� " + "\n�������� ������� ������� ���� ����������� "
				+ "\n�� ��������� �������� ������� �������: ");
		System.out.println(Arrays.toString(arr));;
		
		
	}
	static int binarySearch(int arr[], int start, int end, int elem) {

		int mid = start + (end - start) / 2;

		if(elem==arr[mid]) {
			return mid;
		}
		if (elem < arr[start]) {
			return -1;
		}
		if (elem > arr[end]) {
			return end;
		}
		if (arr[mid] < elem && elem <= arr[mid + 1]) {
			return mid;
		}
		if (arr[mid] > elem) {
			return binarySearch(arr, start, mid - 1, elem);
		}
		return binarySearch(arr, mid + 1, end, elem);
	
    }
}