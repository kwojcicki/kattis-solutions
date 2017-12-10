import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class veci {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] x = in.readLine().toCharArray();
		int starting = Integer.parseInt(new String(x));
		int lowest = Integer.MAX_VALUE;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length - 1; j++) {
				char temp = x[j];
				x[j] = x[j + 1];
				x[j + 1] = temp;
				int number = Integer.parseInt(new String(x));
				System.out.println(number);
				if(number < lowest && number > starting) {
					//System.out.println(number);
					lowest = number;
				}
				System.out.println("---");
			}
		}
		
		if(lowest == Integer.MAX_VALUE || lowest <= starting) {
			System.out.println("0");
		} else {
			System.out.println(lowest);
		}
	}
}
