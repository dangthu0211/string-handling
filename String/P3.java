package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P3 {
	public static void main(String[] args) {
		String str;
		System.out.print("Nhập chuỗi: ");
		str = new Scanner(System.in).nextLine();
		
		StringTokenizer strTok = new StringTokenizer(str);

		StringBuilder strBuild = new StringBuilder();

		while (strTok.hasMoreTokens()) {
			String s = strTok.nextToken();
			if(s.length() <= 1) {
				strBuild.append(s.toUpperCase());
			}
			else {
				strBuild.append(s.toUpperCase().charAt(0) + s.substring(1));
			}
			strBuild.append(" ");
			
		}
		
		System.out.println("Chuẩn hóa:" + strBuild);
	}

}
