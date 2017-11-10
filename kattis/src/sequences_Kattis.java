
import java.util.*;
import java.io.*;
import java.math.*;
public class sequences_Kattis {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] s = in.readLine().toCharArray();
		goodCopy(s);
	}

	public static void goodCopy(char[] s) {
		long mod = (long) (Math.pow(10, 9) + 7);
		long ones = 0;
		long questions = 0;
		long val = 0;
		long pow2mod = 1L;
		long pow2modPrev = 1L;
		for(int i = 0; i < s.length; i++) {
			val = val % mod;
			if(s[i] == '?') {
				val = (val % mod) + (val % mod) + (ones * pow2mod % mod);
				val += (questions * pow2modPrev) % mod;
				questions++;
				pow2modPrev = pow2mod;
				pow2mod = (pow2mod * 2) % mod;
			} else if(s[i] == '1') {
				ones++;
			} else if(s[i] == '0') {
				if(questions > 0) {
					val = (val + (ones * pow2mod) % mod + (pow2modPrev * questions) % mod) % mod;
				} else {
					val += ones; 
				}
			}
		}

		System.out.println(val % mod);
	}
}