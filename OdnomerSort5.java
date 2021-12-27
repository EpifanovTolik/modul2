package by.jonline.tolik.modul_2;

import java.util.Arrays;

// Сортировка вставками. Дана последовательность чиесл a1,a2,..,an. Требуется 
// переставить числа в порядке возрастания. Делается это следующим образом. Пусть 
// a1,a2,..,ai упорядоченная последовательность , т.е. a1<=a2<=..<=an. Берется 
// следующее число ai+1  и вставляется в последовательность так, чтобы новая 
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока 
// все элементы от i+1 до n не будут перебраны. Место помещения очередного элемента
// в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
// оформить в виде отдельной функции.

// Как сюда приспособить двоичный поиск не разобрался

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
