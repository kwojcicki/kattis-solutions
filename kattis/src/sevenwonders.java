import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sevenwonders {
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        int numT = 0, numC = 0, numG = 0;
        for(int i = 0 ; i < input.length(); i++){
            switch (input.charAt(i)) {
                case 'T' : {
                    numT++;
                    break;
                }
                case 'C' : {
                    numC++;
                    break;
                }
                case 'G' : {
                    numG++;
                    break;
                }
            }
        }
        int numSet = Math.min(numT, Math.min(numC, numG));
        int points = (int)(Math.pow((double)numT, 2) + Math.pow((double)numC, 2) + Math.pow((double)numG, 2) + numSet * 7);
        System.out.println(points);
    }
}
