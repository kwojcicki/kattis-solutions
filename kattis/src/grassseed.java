import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class grassseed {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double n = Double.parseDouble(in.readLine());
		int j = Integer.parseInt(in.readLine());
		double sum = 0;
		for(int i = 0; i < j; i++) {
			String[] s = in.readLine().split(" ");
			double w = Double.parseDouble(s[0]);
			double l = Double.parseDouble(s[1]);
			sum += n * w * l;
		}
		System.out.println(sum);
	}
}
