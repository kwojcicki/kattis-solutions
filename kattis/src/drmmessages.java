import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class drmmessages {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] s = in.readLine().toCharArray();
		int rotate = 0;
		for(int i = 0; i < s.length / 2;i++) {
			rotate += s[i] % 65;
		}
		for(int i = 0; i < s.length / 2;i++) {
			s[i] = (char) ((s[i] - 65 + rotate)  % 26 + 65);
		}
		rotate = 0;
		for(int i = s.length / 2; i < s.length;i++) {
			rotate += s[i] % 65;
		}
		for(int i = s.length / 2; i < s.length;i++) {
			s[i] = (char) ((s[i] - 65 + rotate)  % 26 + 65);
		}

		char[] s1 = new char[s.length / 2];
		for(int i = 0; i < s.length / 2;i++) {
			s1[i] = (char) ((s[i] - 65 + s[i + s.length/2] % 65)  % 26 + 65);
		}
		System.out.println(new String(s1));
	}
}
