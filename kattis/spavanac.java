import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spavanac {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		int hours = Integer.parseInt(s[0]);
		int minutes = Integer.parseInt(s[1]);
		int total = hours * 60 + minutes;
		total -= 45;
		if(total < 0) {
			total += 24*60;
		}
		System.out.println((total/60) + " " + (total%60));
	}
}
