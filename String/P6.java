package String;

import java.util.Scanner;
import java.util.regex.*;

public class P6 {
	public static void main(String[] args) {
		String str;
		System.out.print("Nhập câu: ");
		str = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^(\\w{1,10}+ ?){1,20}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		System.out.println("\nChuỗi " + str + " có định dạng: " + matcher.matches());
		while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
	}
}
