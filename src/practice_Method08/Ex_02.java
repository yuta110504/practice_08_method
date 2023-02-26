package practice_Method08;

import java.util.Scanner;

public class Ex_02 {
	static double chuvi(double r) {
		return (r * 2) * 3.14;
	}

	static double dientich(double r) {
		return 3.14 * Math.pow(r, 2);
	}

	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		System.out.print("Hay nhap r : ");
		double r = imp.nextDouble();
		double chuvi = chuvi(r);
		double dientich = dientich(r);
		System.out.println("Chu vi hinh tron : " + chuvi);
		System.out.print("Dien tich hinh tron : " + dientich);
	}
}
