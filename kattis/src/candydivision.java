import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class candydivision {
	// Doesnt actually work yet
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(in.readLine());
		SortedSet<Integer> list = new TreeSet<Integer>();
		for(int i = 2; i <= Math.ceil(Math.sqrt((double)n)); i++){
			if(n % i == 0){
				list.add(i);
				if(i != n/i) list.add((int)n/i);
			}
		}

		System.out.print(0);
		Iterator<Integer> x = list.iterator();
		while(x.hasNext()){
			System.out.print(" " + (x.next() - 1));
		}
		System.out.print(" " + (n - 1));
	}
}
