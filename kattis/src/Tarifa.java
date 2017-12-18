import java.util.Scanner;

public class Tarifa {

	// Krystian Tarifa
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(in.readLine());
//		int s = Integer.parseInt(in.readLine());
//		int sum = 0;
//		for(int i = 0; i < s; i++) {
//			sum += (n - Integer.parseInt(in.readLine()));
//		}
//		System.out.println(sum + n);
//	}
	
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int megaBytesPerMonth = s.nextInt();
        int n = s.nextInt();
        int n_1 =  megaBytesPerMonth;
        for(int i = 0 ; i < n ; i++){
            n_1 += megaBytesPerMonth - s.nextInt();
        }
        System.out.println(n_1);
    }

}
