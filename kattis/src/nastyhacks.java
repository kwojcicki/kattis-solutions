import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class nastyhacks {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++) {
			String[] s = in.readLine().split(" ");
			int r = Integer.parseInt(s[0]);
			int e = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			if(r < e - c) {
				System.out.println("advertise");
			} else if (r > e - c) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");	
			}
		}	
	}
}
