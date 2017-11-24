import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class wizardofodds {

    public static void main(String[]args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        BigInteger N = new BigInteger(input[0]);
        BigInteger K = new BigInteger(input[1]);
        BigInteger two = new BigInteger("2");
        BigInteger x = N;
        for(BigInteger i = new BigInteger("1"); i.compareTo(K) <= 0  ; i=i.add(BigInteger.ONE)){
            if (x.mod(two).compareTo(BigInteger.ONE) == 0){
                x = x.divide(two).add(BigInteger.ONE);
            }else{
                x = x.divide(two);
            }
            if(x.intValue() == 1){
                System.out.print("Your wish is granted!");
                return;
            }
        }
        System.out.print("You will become a flying monkey!");
    }
}
