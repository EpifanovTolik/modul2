package by.jonline.tolik.modul_2;

import java.util.Arrays;

// 10. Дан целочисленный массив с количеством элементов n. Сжать массив , выбросив из него
//     каждый второй элемент(освободившиеся элементы заполнить нулями). Дополнительный 
//     массив не использовать.

public class OdnomerMass10 {

	public static void main(String [] args) {
		
		int [] arr = {-4,-3,-2,-1,0,1,2,3,4,5};
		
		int j;
		for(int i =1 ; i<arr.length; i=i+2) {
			arr[i] =0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
