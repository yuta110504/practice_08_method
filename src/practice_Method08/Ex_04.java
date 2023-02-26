package practice_Method08;

import java.util.Scanner;

public class Ex_04 {
	static int[]tongsole(int n) {
		int tongsole = 0 ;
		int a [] = new int [n];
		int pt = 0 ;
		for (int i =1; i <= n; i++) {  
			if(i % 2 != 0 ) {
				pt ++ ;
				a[pt] = i;
			}	
	}return a ;
		}
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("Hay nhap n : ");
		int n = imp.nextInt();
		int tong = 0 ;
		int[] tongsole = tongsole(n);
		for (int i = 0; i < tongsole.length; i++) {
			if (tongsole[i] > 0 ) {
				tong += tongsole[i];
			}
		}
		System.out.print(+tong+ " ( Do ");
		for (int i = 0; i < tongsole.length-1; i++) {
			if (tongsole[i] > 0&&tongsole[i+1] > 0 ) {
				System.out.print(tongsole[i]+" + ");
			} else if (tongsole[i] > 0 )System.out.print(tongsole[i]);
		}
		System.out.println(" = " +tong+" ) ");
		
	}
}
