import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sibice {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int w = Integer.parseInt(s[1]);
		int h = Integer.parseInt(s[2]);
		
		double maxLength = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
		for(int i = 0; i < n;i++) {
			if(maxLength >= Integer.parseInt(in.readLine())) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}
}
