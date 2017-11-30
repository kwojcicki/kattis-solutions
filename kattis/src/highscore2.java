import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class highscore2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++){
			String[] s = in.readLine().split(" ");
			long c = Integer.parseInt(s[0]);
			long t = Integer.parseInt(s[1]);
			long co = Integer.parseInt(s[2]);
			long w = Integer.parseInt(s[3]);
			if(w >= 100 || w == 0 ){
				System.out.println(formula(c + w, t, co).max((formula(c, t + w, co).max(formula(c, t, co + w)))));
			} else {
				BigInteger max = BigInteger.ZERO;
				for(int j = 0; j <= w; j++){
					for(int k = 0; k <= w - j; k++){
						max = max.max(formula(c + j, t + k, co + (w - j - k)));
					}
				}
				System.out.println(max);
			}

		}
	}

	private static BigInteger formula(long i, long tablet, long compass) {
		long max = Math.min(i, Math.min(tablet, compass));
		return BigInteger.valueOf(i).pow(2).add(BigInteger.valueOf(tablet).pow(2).add(BigInteger.valueOf(compass).pow(2).add(BigInteger.valueOf(7L).multiply(BigInteger.valueOf(max)))));
	}
}
