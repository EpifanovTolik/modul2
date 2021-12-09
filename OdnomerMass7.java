package by.jonline.tolik.modul_2;

// 7. Даны действительные числа a1,a2...an. Найти max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).
//    Если правильно понял условие, найти максимальное из суммы первого и последнего элемента, 
//	  второго и предпоследнего и тд. и тогда нужно четное количество элементов в массиве

public class OdnomerMass7 {

	public static void main(String[] args) {
		
		double [] arr = {-9,5,1,0,-9,-5}; 
		double sum;
		double max = arr[0] + arr[arr.length-1];
		
		
		for(int i = 0, j = arr.length-1; i<arr.length/2; i++, j-- ) {
		sum = arr[i]+arr[j];
		
		System.out.println("сумма элементов = "+sum);
		if(sum>max) {
			max = sum;
			System.out.println("максимальное значение = "+max);
		}		
		}
		System.out.println("итоговое максимальное = "+max);
	}
}
