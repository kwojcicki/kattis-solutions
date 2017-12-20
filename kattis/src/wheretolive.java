import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wheretolive {
	//Not fully working yet
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals("0"); s = in.readLine() ){
			int n = Integer.parseInt(s);
			float x = 0;
			float y = 0;
			for(int i = 0; i < n;i++){
				String[] s1 = in.readLine().split(" ");
				x += Integer.parseInt(s1[0]);
				y += Integer.parseInt(s1[1]);
			}
			x /= n;
			y /= n;
			System.out.println(Math.round(x) + " " + Math.round(y));
		}
	}
}
