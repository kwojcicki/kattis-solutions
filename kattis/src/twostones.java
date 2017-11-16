import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class twostones {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x  = Integer.parseInt(in.readLine());
		System.out.println((x % 2 == 1) ? "Alice" : "Bob");
	}

}