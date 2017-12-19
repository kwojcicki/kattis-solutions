import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mastermind {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] sInput = in.readLine().split(" ");
		char[] s1 = sInput[1].toCharArray();
		char[] s2 = sInput[2].toCharArray();
		Map<Character, Integer> has = new HashMap<Character, Integer>();
		Map<Character, Integer> seen = new HashMap<Character, Integer>();
		int r = 0;
		int s = 0;
		for(int i = 0; i < s1.length; i++){
			if(s1[i] == s2[i]){
				r++;
			} else {
				if(has.get(s1[i]) == null){
					has.put(s1[i], 0);
				}
				has.put(s1[i], has.get(s1[i]) + 1);
				if(seen.get(s2[i]) == null){
					seen.put(s2[i], 0);
				}
				seen.put(s2[i], seen.get(s2[i]) + 1);
			}
		}
		for(Entry<Character, Integer> x : has.entrySet()){
			if(seen.get(x.getKey()) != null){
				s += Math.min(x.getValue(), seen.get(x.getKey()));
			}
		}
		System.out.println(r + " " + s);
	}
}
