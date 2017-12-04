import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class planina {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		System.out.println((int)Math.pow((Math.sqrt(Math.pow(4, n)) + 1),2));
	}
}
