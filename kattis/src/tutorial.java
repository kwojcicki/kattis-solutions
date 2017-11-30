import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tutorial {
	// never again T_T
	// not sure if the 1E-6 is needed
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		int t = Integer.parseInt(s[2]);
		System.out.println(accepted(m,n,t) ? "AC\n" : "TLE\n");		
	}

	private static boolean accepted(int m, int n, int t) {
		int[] factorials = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
		return (t == 1 && !((n > 12 || factorials[(int) n] > m))  ||
				(t == 2 && n <= log2(m) + 1E-6) || 
				(t == 3 && n <= Math.pow(m, 0.25) + 1E-6) ||
				(t == 4 && n <= Math.pow(m, 0.333333333333333333333333333333333333333333333333333333) + 1E-6) ||
				(t == 5 && n <= Math.pow(m, 0.5) + 1E-6) || 
				(t == 6 && n * log2(n) <= m + 1E-6) || 
				(t == 7 && n <= m));

	}

	private static double log2(int m) {
		return Math.log(m) / Math.log(2);
	}
}
