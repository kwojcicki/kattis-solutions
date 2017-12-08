import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class speedlimit {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(in.readLine());
			if(n == -1) {
				break;
			}
			int total = 0;
			int prevHour = 0;
			for(int i = 0; i < n; i++) {
				String[] s = in.readLine().split(" ");
				int speed = Integer.parseInt(s[0]);
				int hour = Integer.parseInt(s[1]);
				total += (hour - prevHour) * speed;
				prevHour = hour;
			}
			System.out.println(total + " miles");
		}
	}
}
