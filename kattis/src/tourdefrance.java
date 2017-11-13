import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class tourdefrance {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals("0"); s = in.readLine() ){
			String[] s1 = s.split(" ");
			int f = Integer.parseInt(s1[0]);
			int r = Integer.parseInt(s1[1]);
			double[] f1 = new double[f];
			double[] r1 = new double[r];
			
			String[] fs = in.readLine().split(" ");
			String[] rs = in.readLine().split(" ");
			for(int i = 0; i < f; i++){
				f1[i] = Double.parseDouble(fs[i]);
			}
			for(int i = 0; i < r; i++){
				r1[i] = Double.parseDouble(rs[i]);
			}
			
			SortedSet<Double> set = new TreeSet<Double>();
			for(int i = 0; i < f; i++){
				for(int j = 0; j < r; j++){
					set.add(r1[j] / f1[i]);
				}
			}
			
			Iterator<Double> x = set.iterator();
			double l1 = x.next();
			double l2;
			double max = 0;
			while(x.hasNext()){
				l2 = x.next();
				max = Math.max(max, l2 / l1);
				l1 = l2;
			}
			System.out.printf("%.2f%n", max);
		}
	}
}
