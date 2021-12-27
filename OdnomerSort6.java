package by.jonline.tolik.modul_2;

import java.util.Arrays;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по
// возрастанию. Делается это следующим образом: сравниваются два соседних элемента 
// ai и ai+1 . Если ai<=ai+1, то продвигаются на один элемент вперед.Если ai>ai+1, 
// то производится перестановка и сдвигаются на один элемент назад.
// составить алгоритм этой сортировки.

public class OdnomerSort6 {
public static void main(String[]args) {
	
	int [] arr = {9,8,2,7,9,4,6,7,1,5};
	int n =arr.length;
	
	for (int step = n / 2; step > 0; step /= 2) {
	    for (int i = step; i < n; i++) {
	        for (int j = i - step; j >= 0 && arr[j] > arr[j + step] ; j -= step) {
	            int x = arr[j];
	            arr[j] = arr[j + step];
	            arr[j + step] = x;
	        }
	    }
	}
	System.out.println(Arrays.toString(arr));
}
}
