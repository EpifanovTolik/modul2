package by.jonline.tolik.modul_2;

import java.lang.reflect.Array;
import java.util.Arrays;

// 4. Даны действительные числа a1,a2,...an. Поменять местами наименьший и наибольший элемент.

public class OdnomerMass4 {

	public static void main(String[] args) {
		
		double [] arr = {8.5,-5,10,35,-2};
 		
		double min = arr[0];
		int indexMin = 0;
		double max = arr[0];
		int indexMax = 0;
		double pos;
		
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				min = arr[i];
				indexMin = i;
			}
			
			if(arr[i]>max) {
			max = arr[i];
			indexMax = i;
			}				
		}		
			System.out.println("min = " +min);
			System.out.println("max = " +max);
			
			System.out.println(indexMin);
			System.out.println(indexMax);
			
			System.out.println(Arrays.toString(arr));
			
			pos = arr[indexMin];
			arr[indexMin] = arr[indexMax];
			arr[indexMax] = pos;
			
		System.out.println(Arrays.toString(arr));
			
			
			
	}

}
