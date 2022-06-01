package String;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		String s1,s2;
		System.out.print("Nhập s1: ");
		s1 = new Scanner(System.in).nextLine();
		System.out.print("Nhập s2: ");
		s2 = new Scanner(System.in).nextLine();
		StringBuilder strBuild = new StringBuilder(s1);
		while(strBuild.indexOf(s2) > -1) {
			strBuild.delete(strBuild.indexOf(s2), strBuild.indexOf(s2) + s2.length());
		}
		System.out.println(strBuild);
	}
}
