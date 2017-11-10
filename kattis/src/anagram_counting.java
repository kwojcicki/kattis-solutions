

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class anagram_counting {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals(""); s = in.readLine() ){
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i = 0; i < s.length(); i++){
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i), 1 + map.get(s.charAt(i)));
				} else {
					map.put(s.charAt(i), 1);
				}
			}
			
			Iterator<Entry<Character, Integer>> x = map.entrySet().iterator();
			BigInteger sum = BigInteger.ONE;
			int length = s.length();
			while(x.hasNext()){
				int value = x.next().getValue();
				sum = sum.multiply(combinations(length, value));
				length -= value;
			}
			System.out.println(sum);
		}
	}
	
	public static BigInteger factorial(int n){
		BigInteger sum = BigInteger.ONE;
		if(n == 0 || n == 1) return BigInteger.ONE;
		for(int i = 1; i <= n; i++){
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		return sum;
	}
	
	public static BigInteger combinations(int n, int r){
		return  factorial(n).divide(factorial(r).multiply(factorial(n - r)));
	}
}
