package by.jonline.tolik.modul_2;

// 9. В массиве целых чисел с количеством элементов n найти наиболее часто всречающееся число. 
//    Если таких чисел несколько, то определить наименьшее из них.

public class OdnomerMass9 {
	public static void main(String[] args) {

		int[] arr = { 7,9,7,2,7,7,7,2,2,2,2 };

		int count = 0;
		int countmax = 0;
		int num;
		int min = arr[0]; 
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == arr[i] && j != i) {

					count++;

					if (count > countmax) {
						countmax = count;
						min = arr[j];
						}
					else if(count == countmax) {
						num = arr[j];
						if (num < min) {
							min = num;
						}
					}				
				}
			}
			count = 0;
		}
		System.out.println("минимальное число из всех повторяющихся " + min);
		System.out.println("максимальное количество раз повторяется  " + countmax);
	}
}

