package String;

public class P1 {
	public static void main(String[] args) {
		int n = 100000;
		System.out.println("So thuan nghich co 6 chu so");
	    while (n<=999999) {
	    	if(check(n)) {
	        	System.out.println(n);
	    	}
	    	n++;
	    }
	}
	public static boolean check(int n) {
		String str = Integer.toString(n);
		
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append(n);
    	strBuilder.reverse();
    	
    	return (str.equals(strBuilder.toString()))?true:false;
	}

}
