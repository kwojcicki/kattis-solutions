import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class cd {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = 1, m = 1;
		while(true){
			String[] c = in.readLine().split(" ");
			n = Integer.parseInt(c[0]);
			m = Integer.parseInt(c[1]);
			if(n == 0 && m == 0){
				break;
			}
			Set<Long> set = new HashSet<Long>();
			for(int i = 0; i < n; i++){
				set.add(Long.parseLong(in.readLine()));
			}

			int count = 0;
			for(int i = 0; i < m; i++){
				if(set.contains(Long.parseLong(in.readLine()))){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
