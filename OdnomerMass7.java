package by.jonline.tolik.modul_2;

// 7. ���� �������������� ����� a1,a2...an. ����� max(a1 + a2n, a2 + a2n-1, ..., �n + an+1).
//    ���� ��������� ����� �������, ����� ������������ �� ����� ������� � ���������� ��������, 
//	  ������� � �������������� � ��. � ����� ����� ������ ���������� ��������� � �������

public class OdnomerMass7 {

	public static void main(String[] args) {
		
		double [] arr = {-9,5,1,0,-9,-5}; 
		double sum;
		double max = arr[0] + arr[arr.length-1];
		
		
		for(int i = 0, j = arr.length-1; i<arr.length/2; i++, j-- ) {
		sum = arr[i]+arr[j];
		
		System.out.println("����� ��������� = "+sum);
		if(sum>max) {
			max = sum;
			System.out.println("������������ �������� = "+max);
		}		
		}
		System.out.println("�������� ������������ = "+max);
	}
}
