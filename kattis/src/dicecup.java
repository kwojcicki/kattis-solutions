import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dicecup {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int x1 = Integer.parseInt(s[0]);
		int x2 = Integer.parseInt(s[1]);
		if(x1 == x2) {
			System.out.println(x1+1);
			return;
		} 
		for(int i = Math.min(x1, x2) + 1; i <= Math.max(x1, x2) + 1; i++) {
			System.out.println(i);
		}
	}
}
