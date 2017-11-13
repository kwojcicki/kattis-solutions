import java.util.Scanner;

public class Tarifa {

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
