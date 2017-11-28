import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class infiniteslides {
	private static double W;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		W = Double.parseDouble(in.readLine());
		double startingRange = W * 2;
		double endingRange = W * 2;
		while(dervativeFunction(startingRange) > 0){
			startingRange -= 0.1;
		}
		endingRange = startingRange + 0.1;
		while(dervativeFunction(endingRange) < 0){
			endingRange += 0.1;
		}
		int steps = 20;
		while(steps >= 0){
			steps--;
			double middle = (startingRange + endingRange)/2;
			double c = dervativeFunction(middle);
			if(c == 0){
				startingRange = middle;
				break;
			} else if(c > 0){
				endingRange = middle;
			} else if(c < 0){
				startingRange = middle;
			}
		}
		System.out.println(distanceFunction(startingRange));
	}
	
	public static double dervativeFunction(double x){
		return Math.sin(W - x) - 2 * W + x + Math.sin(x);
	}
	public static double distanceFunction(double x){
		return Math.sqrt(Math.pow((Math.cos(x) - Math.cos(x - W) - 1),2) +
				Math.pow((Math.sin(x) - Math.sin(x - W)),2) +
				Math.pow(x-2*(x-W),2));
	}
}
