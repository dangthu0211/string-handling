package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P5 {
	public static void main(String[] args) {
		String str;
		System.out.print("Nhập họ tên: ");
		str = new Scanner(System.in).nextLine();
		
		StringTokenizer strTok = new StringTokenizer(str);

		StringBuilder strBuild = new StringBuilder();
		String firstName = "", lastName = "";
		
		int n = strTok.countTokens();
		for(int i = 0; i< n; i++) {
			String s = strTok.nextToken();
			if(i<1) {
				lastName = s + " ";
			}
			else if(i<n-1) {
				strBuild.append(s + " ");
			}
			else {
				firstName = s + " ";
			}
		}
		strBuild.insert(0, firstName);
		strBuild.append(lastName);
		
		System.out.println(strBuild);
	}
}
