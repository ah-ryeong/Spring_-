package crawnewsapp;

public class MyUtil {
	public static String increaseOid(String input) {
		
		int temp = Integer.parseInt(input);
		temp ++;
		String s = String.format("%03d", temp);
		
		return s;
	}
}
