package by.jonline.tolik.modul_2;

import java.util.Arrays;

// ƒаны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. ќбразовать из них
// новую последовательность чисел так, чтобы она тоже была неубывающей. ƒополнительный
// массив не использовать

public class OdnomerSort2 {
public static void main(String [] args) {
	
	int [] arr1 = {2,2,3,4,9};
	int [] arr2 = {3,8,5,6,7};
	
	int [] arr3 = new int [arr1.length+arr2.length];
	
	for(int i=0; i<arr1.length; i++) {
		System.out.print(arr1[i]);
		arr3[i]=arr1[i];
	}
	for(int j=0; j<arr2.length; j++) {
		System.out.print(arr2[j]);
		arr3[arr1.length+j]=arr2[j];
	}
	System.out.println();
	System.out.println(Arrays.toString(arr3));
	for(int i=1; i<arr3.length; i++) {
		int current = arr3[i];
		int j= i-1;
		while(j>=0 && current<arr3[j])  {
			arr3[j+1]=arr3[j];
			j--;	
		}
		arr3[j+1]=current;
	}
	System.out.println(Arrays.toString(arr3));
}
	
}
