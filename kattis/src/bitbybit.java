import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitbybit {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals("0"); s = in.readLine() ){
			char[] p = new char[32];
			for(int i = 0; i < 32;i++){
				p[i] = '?';
			}
			int n = Integer.parseInt(s);
			for(int i = 0; i < n; i++){
				String[] q = in.readLine().split(" ");
				if(q[0].equals("CLEAR")){
					p[Integer.parseInt(q[1])] = '0';
				} else if(q[0].equals("SET")){
					p[Integer.parseInt(q[1])] = '1';
				} else if(q[0].equals("OR")){
					int byteOne = Integer.parseInt(q[1]);
					int byteTwo = Integer.parseInt(q[2]);
					if(p[byteOne] == '?' || p[byteTwo] == '?'){
						if(p[byteOne] == '1' | p[byteTwo] == '1'){
							p[byteOne] = '1';
						} else {
							p[byteOne] = '?';
						}
						continue;
					}
					p[byteOne] = (char) ((Integer.parseInt(p[byteOne] + "") | Integer.parseInt(p[byteTwo] + "")) + 48);
				} else if(q[0].equals("AND")){
					int byteOne = Integer.parseInt(q[1]);
					int byteTwo = Integer.parseInt(q[2]);
					if(p[byteOne] == '?' || p[byteTwo] == '?'){
						if(p[byteOne] == '0' || p[byteTwo] == '0'){
							p[byteOne] = '0';
						} else {
							p[byteOne] = '?';
						}
						continue;
					}
					p[byteOne] = (char) ((Integer.parseInt(p[byteOne] + "") & Integer.parseInt(p[byteTwo] + "")) + 48);
				}  
			}
			System.out.println(new StringBuilder().append(new String(p)).reverse().toString());
		}
	}
}
