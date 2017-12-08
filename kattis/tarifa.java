import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarifa {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int s = Integer.parseInt(in.readLine());
		int sum = 0;
		for(int i = 0; i < s; i++) {
			sum += (n - Integer.parseInt(in.readLine()));
		}
		System.out.println(sum + n);
	}
}
