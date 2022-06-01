package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P4 {
	public static void main(String[] args) {
		String str;
		System.out.print("Nhập chuỗi: ");
		str = new Scanner(System.in).nextLine();
		
		StringTokenizer strTok = new StringTokenizer(str);

		StringBuilder strBuild = new StringBuilder("");
		
		while (strTok.hasMoreTokens()) {
			String s = strTok.nextToken();
			if(strBuild.length() < s.length()) {
				if(strBuild.length() != 0 ) {
					strBuild.delete(0, strBuild.length()-1);
				}
				strBuild.append(s);
			}
		}

		System.out.println("Chuỗi dài nhất là: " + strBuild + " nằm ở vị trí " + str.indexOf(strBuild.toString()));
	}
}
