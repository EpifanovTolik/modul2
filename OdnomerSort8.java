package by.jonline.tolik.modul_2;

import java.nio.file.Watchable;
import java.util.Arrays;

// Даны дроби p1/q1,p2/q2,...pn/qn.(pi, qi - натуральные). Составить программу, 
// которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке
// возрастания

public class OdnomerSort8 {
	public static void main(String[] args) {
	
		double [] p=  {8,2,7,6,1,9};;
		double [] q=  {5,3,2,9,2,4};
			
		double [] m = new double[p.length]; //массив приведенных числителей
		double [] x =new double[p.length]; //массив  итоговый не сорт
		
		double max=q[0];
		
		for(int i=0; i<q.length; i++) {
			if(q[i]>=max) {
				max=q[i];
			}
		}
		System.out.println("наибольший знаменатель = "+max);
		int k=2;
		double znam=max;
		for(int j=0; j<q.length;j++) {
			while(znam % q[j] !=0) {
				znam=max*k;
				k++;
				j=0;
			}			
		}
		System.out.println("общий знаменатель = "+znam);
		for(int i=0; i<p.length; i++) {
			m[i]= p[i]*(znam/q[i]);
		}
		System.out.println("числители приведенные = "+Arrays.toString(m));
		for(int i=0; i<p.length; i++) {
			x[i]= m[i]/znam;
		}
		System.out.println("итоговый массив = "+Arrays.toString(x));
		//сортировка
		for(int i=0; i<x.length; i++) {
			double min =x[i];
			int pos=i;
			for(int j=i+1; j<x.length;j++) {
				if(x[j]<min) {
					min=x[j];
					pos=j;
				}
			}
			x[pos]=x[i];
			x[i]=min;
		}
		System.out.println("сортированный итоговый = "+Arrays.toString(x));
	}
}
