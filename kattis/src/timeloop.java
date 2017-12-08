import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timeloop {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 1; i <= n; i++) {
			System.out.println(i + " Abracadabra");
		}
	}
}
