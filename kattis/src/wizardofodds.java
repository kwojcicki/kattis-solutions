import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class wizardofodds {

//  Krystians Wizardofodds
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String[] s = in.readLine().split(" ");
//		BigInteger n = new BigInteger(s[0]);
//		BigInteger k = new BigInteger(s[1]);
//
//		
//		BigInteger two = BigInteger.valueOf(2L);
//		
//		if(k.compareTo(BigInteger.ZERO) == 0){
//			System.out.println("You will become a flying monkey!");
//			return;
//		}
//		BigInteger i = BigInteger.ZERO;
//		for(; i.compareTo(k) == -1 && n.compareTo(BigInteger.ONE) >= 0; i = i.add(BigInteger.ONE)){
//			//System.out.println(k + " " + i + " " + n);
//			if(n.mod(two).compareTo(BigInteger.ONE) == 0) n = n.add(BigInteger.ONE);
//			n = n.divide(two);
//		}
//		int compareTo = n.compareTo(BigInteger.ONE);
//		//System.out.println(k + " " + i + " " + n);
//		if(compareTo <= 0){
//			System.out.println("Your wish is granted!");
//		} else {
//			System.out.println("You will become a flying monkey!");
//		}
//	}
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
