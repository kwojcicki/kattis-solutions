import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class batter {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split(" ");
		double bases = 0;
		for(int i = 0; i < s.length;i++) {
			int x = Integer.parseInt(s[i]);
			if(x > -1) {
				bases += x;
			} else {
				n --;
			}
		}
		
		System.out.println(bases/n);
	}

}
