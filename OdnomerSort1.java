package by.jonline.tolik.modul_2;

import java.util.Arrays;

// Заданы два одномерных массива с различным количеством элементов и натуральное число
// k. Объеденить их в один массив, включив второй массив между k-м и (k+1) -м 
// элементами первого, при этом не используя дополнительный массив.

public class OdnomerSort1 {

	public static void main(String[] args) {
	
		
		int k =3;
 
 int [] arr1 = {9,8,7,6,10,11,12,13,14};
 int [] arr2 = {1,2,3,4,5};
		
int [] arr3 = new int [arr1.length+arr2.length];
 
for(int i=0; i<=k; i++) {
	System.out.print(arr1[i]+" ");
	arr3[i]=arr1[i];
}
for(int h=0; h<arr2.length; h++) {
	System.out.print(arr2[h]+" ");
	arr3[k+h+1]=arr2[h];
}
for(int j=k+1; j<arr1.length; j++) {
	System.out.print(arr1[j]+" ");
	arr3[j+arr2.length]=arr1[j];
}
System.out.println(Arrays.toString(arr3));
	}

}
