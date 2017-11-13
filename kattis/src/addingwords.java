import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class addingwords {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> stringToValue = new HashMap<String, Integer>();
		Map<Integer, String> valueToString = new HashMap<Integer, String>();
		for(String s = in.readLine(); s != null && !s.equals(""); s = in.readLine() ){
			String[] c = s.split(" ");
			if(s.equals("clear")){
				stringToValue = new HashMap<String, Integer>();
				valueToString = new HashMap<Integer, String>(); 
			} else if(c[0].equals("def")){
				
				Object x = stringToValue.put(c[1], Integer.parseInt(c[2]));
				valueToString.put(Integer.parseInt(c[2]), c[1]);
				if(x != null){
					valueToString.remove((int) x);
					
				}
				
			} else if(c[0].equals("calc")){
				int operator = 0;
				int sum = 0;
				boolean flag = false;
				for(int i = 1; i < c.length; i = i + 2){
					if(stringToValue.get(c[i]) == null){
						flag = true;
					}
					System.out.print(c[i] + " " + c[i + 1] + " ");
					
					if(operator == 0 && !flag){
						sum += stringToValue.get(c[i]);
					} else if(operator == 1 && !flag){
						sum -= stringToValue.get(c[i]);
					} 
					
					
					if(c[i + 1].equals("-")){
						operator = 1;
					} else if(c[i + 1].equals("+")){
						operator = 0;
					} else if(c[i + 1].equals("=")){
						if(flag || valueToString.get(sum) == null){
							System.out.println("unknown");
							break;
						}
						System.out.println(valueToString.get(sum));
						break;
					}  
				}
			}
		}
	}

}
