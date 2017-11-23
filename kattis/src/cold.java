import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cold {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split(" ");
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(s[i]) < 0) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}
