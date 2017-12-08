import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int r1 = Integer.parseInt(s[0]);
		int s1 = Integer.parseInt(s[1]);
		System.out.println((2 * s1 - r1));
	}

}
