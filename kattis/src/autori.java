import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class autori {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split("-");
		String result = "";
		for(int i = 0; i < s.length; i++) {
			result += s[i].charAt(0);
		}
		System.out.println(result);
	}
}
