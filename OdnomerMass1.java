package by.jonline.tolik.modul_2;

import java.util.Scanner;

// 1. В массив A[N] внесены натуральные числа.
//Найти сумму тех элементов,которые кратны K.

public class OdnomerMass1 {
	
	
	public static void main(String[] args) {
		
		int [] arr = {21, 100, 3, 56};
		int k = 3;
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%k == 0) {
				sum = sum + arr[i];
			}
		}
		
System.out.println(sum);
	}

}
