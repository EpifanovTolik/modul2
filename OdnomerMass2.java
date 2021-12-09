package by.jonline.tolik.modul_2;

//2. ƒана последовательность действительных чисел a1,a2,...an. «аменить все ее члены, 
//   большие данного Z, этим числом. ѕодсчитать количество замен.

public class OdnomerMass2 {
	
	public static void main(String[] args) {
		
		int [] arr = {12,25,26,100,5,2,10};
		int z = 20;
		int x = 0; //количество замен
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>z) {
				arr[i] = z;
				x=x+1;
			}	
		}
System.out.println(x);
	}

}
