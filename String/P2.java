package String;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		
		System.out.print("Nhap mang: ");
		
		String s, str = "";
		s = new Scanner(System.in).nextLine();
		for(int i=0 ; i<s.length(); i++) {
			if(i%2==0) str += Character.toUpperCase(s.charAt(i));
			else str += Character.toLowerCase(s.charAt(i));
		}
		System.out.println(str);
	}
}
