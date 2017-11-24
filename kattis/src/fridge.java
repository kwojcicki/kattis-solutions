import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fridge {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] s = in.readLine().toCharArray();
		int[] numbers = new int[]{1,0,0,0,0,0,0,0,0,0};


		for(int i = 0; i < s.length; i++){
			numbers[s[i] - 48] = numbers[s[i] - 48] + 1;
		}

		int index = -1;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] < min){
				index = i;
				min = numbers[i];
			}
		}
		char s1 = (char) (index + 48);
		if(index == 0){
			System.out.print("1");
		} else {
			System.out.print(s1);
		}
		for(int i = 0; i < min; i++){
			System.out.print(s1);
		}
	}
}
