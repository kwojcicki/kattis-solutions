import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quadrant {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		int y = Integer.parseInt(in.readLine());
		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x < 0 && y > 0) {
			System.out.println(2);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		} else if(x > 0 && y < 0) {
			System.out.println(4);
		} 
	}

}
