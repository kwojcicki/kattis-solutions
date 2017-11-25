import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class filip {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int x1 = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
		int x2 = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());
		System.out.println((int)(Math.max(x1, x2)));
	}
}
