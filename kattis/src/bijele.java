import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bijele {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] normal = new int[] {1,1,2,2,2,8};
		String[] s = in.readLine().split(" ");
		for(int i = 0; i < s.length; i++) {
			System.out.print( normal[i] - Integer.parseInt(s[i]) + " ");
		}
	}
}
