import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carrots {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		for(int i = 0; i < Integer.parseInt(s[0]); i++) {
			in.readLine();
		}
		System.out.println(s[1]);
	}
}
