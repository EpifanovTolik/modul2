package by.jonline.tolik.modul_2;

import java.util.Arrays;

// Сортировка обменами. Дана последовательность чиесл a1<=a2<=..<=an. Требуется 
// представить числа в порядке возрастания. Для этого сравниваются два соседних 
// числа ai и ai+1. Если ai>ai+1 , то делается перестановка. Так продолжается до 
// тех пор, пока все элементы не станут расположены в порядке возрастания. 
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
// обменами это пузырьком

public class OdnomerSort4 {

	public static void main(String[] args) {
		
		int [] arr = {9,6,8,5,9,6,4,7,5};
		
		boolean sorted =false;
		int temp;
		int count=0;
		while(!sorted) {
			sorted = true;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i+1]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					sorted=false;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}
