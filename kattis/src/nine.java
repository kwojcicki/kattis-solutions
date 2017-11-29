import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class nine {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int i = 0; i < t; i++){
			long d = Long.parseLong(in.readLine());
			System.out.println(BigInteger.valueOf(8L).multiply(BigInteger.valueOf(9).modPow(BigInteger.valueOf(d - 1),
					BigInteger.valueOf(1000000007))).mod(BigInteger.valueOf(1000000007)));
		}
	}
}
