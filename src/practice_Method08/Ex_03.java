package practice_Method08;

import java.util.Scanner;

public class Ex_03 {
	static int giaithua(int n) {
		int giaithua = 1;
		for (int i = 1; i <= n; i++) {
			giaithua = giaithua * i;
		}
		return giaithua;
	}

	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("NHAP N :");
		int n = imp.nextInt();
		int giaithua = giaithua(n);
		System.out.print("N giai thua vua nhap la : " + giaithua);

	}
}
