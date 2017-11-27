import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class modulo {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i < 10;i++) {
			int x = Integer.parseInt(in.readLine());
			s.add(x % 42);
		}
		System.out.println(s.size());
	}
}
