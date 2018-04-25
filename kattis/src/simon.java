import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simon {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++){

			String s = in.readLine();

			if(s.startsWith("simon says") && !s.equals("") && s.length() > "simon says".length() + 1){
				System.out.println(s.substring("simon says".length() + 1));
			} else {
				System.out.println();
			}

		}
	}
}
