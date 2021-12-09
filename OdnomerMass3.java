package by.jonline.tolik.modul_2;

// 3. Дан массив действительных чисел , размерность которого N. Подсчитать, 
//    сколько в нем отрицательных, положительных и нулевых элементов.

public class OdnomerMass3 {

	public static void main(String[] args) {

		int otr = 0;
		int poloz = 0;
		int nulev = 0;

		double[] arr = { 2.5, -5, 10, 0, -25, 0, 25, 25 };

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<0) {
				otr = otr +1;
			}
			if(arr[i]>0) {
				poloz = poloz +1;
			}
			if(arr[i]== 0) {
				nulev = nulev +1;
			}
	};
		System.out.println("отрицательных: " + otr + " положительных: " + poloz +" нулевых: " + nulev);
	}

}
