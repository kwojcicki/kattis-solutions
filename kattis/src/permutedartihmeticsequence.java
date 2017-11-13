import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class permutedartihmeticsequence {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		while(n-- > 0){
			List<Integer> set = new ArrayList<Integer>();
			String[] c = in.readLine().split(" ");
			int c1 = Integer.parseInt(c[1]);
			int c2 = Integer.parseInt(c[2]);
			set.add(c1);
			set.add(c2);
			int difference = c1 - c2;
			boolean flag = false;
			for(int i = 3; i < c.length; i++){
				int c3 = Integer.parseInt(c[i]);
				if(c2 - c3 != difference){
					flag = true;
				}
				c2 = c3;
				set.add(c3);
			}

			if(flag){
				Collections.sort(set);
				Iterator<Integer> x = set.iterator();
				c1 = x.next();
				c2 = x.next();
				difference = c1 - c2;
				flag = false;
				while(x.hasNext()){
					int c3 = x.next();
					if( c2 - c3 != difference ){
						flag = true;
						break;
					}
					c2 = c3;
				}
				
				if(flag){
					System.out.println("non-arithmetic");
				} else {
					System.out.println("permuted arithmetic");
				}

			} else {
				System.out.println("arithmetic");
			}
		}
	}
}
