
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trollhunt {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int b = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int g = Integer.parseInt(s[2]);

		b -= 1;
		int groups = k/g;
		int days = b / groups;
		if(b % groups > 0 ){
			days += 1;
		}
		
		System.out.println(days);
	}
}
