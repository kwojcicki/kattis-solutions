import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberfun {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++){
			String[] s = in.readLine().split(" ");
			double one = Integer.parseInt(s[0]);
			double two = Integer.parseInt(s[1]);
			double three = Integer.parseInt(s[2]);
			if( one + two == three || one - two == three || two - one == three || one * two == three || one / two == three || two / one == three ){
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
	}
}
