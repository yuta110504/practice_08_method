package practice_Method08;

import java.util.Scanner;

public class Ex_01 {
	static int Ex1(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
		
	}
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	int a , b , c ;
	System.out.println("Nhap a , b , c");
	a = imp.nextInt();
	b = imp.nextInt();
	c = imp.nextInt();
	System.out.print("So lon nhat trong 3 so la :");
	System.out.println(Ex1(a , b ,c));
}
}
