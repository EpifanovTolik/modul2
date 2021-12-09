package by.jonline.tolik.modul_2;

// 8. Дана последовательность чисел a1,a2,..an. Образовать новую последовательность, выбросив
//    из исходной те члены , которые равны min(a1,a2,..an)
//    как полностью выкинуть не знаю, просто заменил значения на ноль. В чате ответов писали ,
//    что так можно в других задачах.

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
