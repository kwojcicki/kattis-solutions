
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class almostperfect {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals(""); s = in.readLine() ){
			int x = Integer.parseInt(s);
			int sum = 0;
			for(int i = 1; i <= Math.sqrt(x); i++){
				if(x % i == 0){
					sum += i;
					if(i != 1 && i != x / i) sum += (x / i);
				}
				if(sum > x + 2){
					break;
				}
			}
			if (sum == x){
				System.out.println(x + " perfect");
			} else if(sum > x + 2 || sum < x - 2){
				System.out.println(x + " not perfect");
			} else {
				System.out.println(x + " almost perfect");
			}
			
		}
	}
}
