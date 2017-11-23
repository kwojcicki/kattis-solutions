import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class secretsanta {

	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(in.readLine());
		} catch (Exception e){
			n = 21;
		}
		// n = 21 since 0.000001 >= P(20) - P(21)
		if(n >= 21){
			n = 21;
		}
		double sum = 1;
		for(int i = 2; i - 1 < n; i++){
			sum -= Math.pow(-1, i)/factorial(i);
		}
		System.out.println(sum);

	}


	private static int factorial(final int num) {
		return IntStream.rangeClosed(2, num).reduce(1, (x, y) -> x * y);
	}


}
