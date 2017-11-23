
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beatspread {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n;i++){
        	String[] a = in.readLine().split(" ");
        	int s = Integer.parseInt(a[0]);
        	int d = Integer.parseInt(a[1]);
        	
        	int diff = s - d;
        	if(diff < 0 || diff % 2 != 0){
        		System.out.println("impossible");
        		continue;
        	}
        	diff = diff / 2;
        	System.out.println((d + diff) + " " + diff);
        }
	}

}
