package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_different_problem {

	public static void main(String[] args) throws IOException {
		//System.out.println(Long.MAX_VALUE);

		System.out.println("Hello");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals(""); s = in.readLine() ){
			String[] s1 = s.split(" ");
			Long l1 = Long.parseLong(s1[0]);
			Long l2 = Long.parseLong(s1[1]);
			System.out.println(Math.abs(l1 - l2));
		}
	}
}
