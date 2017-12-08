import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversebinary {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] s = Integer.toBinaryString(Integer.parseInt(in.readLine())).toCharArray();
		for(int i = 0; i < s.length/2;i++) {
			char temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
		System.out.println(Integer.valueOf(new String(s), 2));
	}
}
