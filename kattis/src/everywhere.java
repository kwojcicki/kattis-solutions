import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class everywhere {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++) {
			int j = Integer.parseInt(in.readLine());
			Set<String> s = new HashSet<String>();
			for(int k = 0; k < j;k++) {
				s.add(in.readLine());
			}
			System.out.println(s.size());
			
		}
	}
}
