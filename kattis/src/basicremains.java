import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class basicremains {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals("0"); s = in.readLine() ){
			String[] c = s.split(" ");
			int b1 = Integer.parseInt(c[0]);
			BigInteger b2 = new BigInteger(c[1], b1);
			BigInteger b3 = new BigInteger(c[2], b1);
			
			System.out.println(b2.mod(b3).toString(b1));
		}
	}
}
