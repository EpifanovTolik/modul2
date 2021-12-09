package by.jonline.tolik.modul_2;

// 5. Даны целые числа a1,a2,...an. Вывести на печать только те числа, для которых ai>i.

public class OdnomerMass5 {

	public static void main(String[] args) {
		
		int [] arr = {5,-10,25,-12,5};
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>i) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
