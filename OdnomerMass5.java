package by.jonline.tolik.modul_2;

// 5. ���� ����� ����� a1,a2,...an. ������� �� ������ ������ �� �����, ��� ������� ai>i.

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
