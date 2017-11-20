import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fractionallotion {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String s = in.readLine(); s != null && !s.equals(""); s = in.readLine() ){
        	int n = Integer.parseInt(s.split("/")[1]);
            int count = 0;
            int max = (int) (n * 2);
            for(int x = n+1; x <= max; x++){
                if((n * x) % (x - n) == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
