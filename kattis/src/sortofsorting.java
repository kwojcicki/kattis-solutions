import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class sortofsorting {
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        while(n != 0) {
            List<String> names = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                names.add(in.readLine());
            }
            //bubble sort (probably a better way to sort tho)
            for(int i = 0 ; i < n ; i++){
                for(int j = 1 ; j < n ; j ++){
                    if(shouldSwap(names.get(j-1), names.get(j))){
                        String tmp = names.get(j);
                        names.set(j,names.get(j-1));
                        names.set(j-1,tmp);
                    }
                }
            }
            for(int i = 0 ; i < n ; i++){
                System.out.println(names.get(i));
            }
            System.out.println();
            n = Integer.parseInt(in.readLine());;
        }
    }
    private static boolean shouldSwap(String x, String y) {
        if (x.charAt(0) > y.charAt(0)){
            return true;
        }else if(x.charAt(0) < y.charAt(0)){
            return false;
        }
        if(x.charAt(1) > y.charAt(1)){
            return true;
        }else if(x.charAt(1) < y.charAt(1)){
            return false;
        }
        return false;
    }
}
