package stringTokenizedDemo;

import java.util.StringTokenizer;

public class StringTokenizedDemo {

	public static void main(String[] args) {
	StringTokenizer s = new StringTokenizer("Techouts Solutions","o");
	while(s.hasMoreTokens()) {
		System.out.println(s.nextToken());
	}
	}

}
