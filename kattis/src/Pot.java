import java.util.Scanner;

public class Pot {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            int p = scan.nextInt();
            sum += Math.pow(p/10, p%10);
        }
        System.out.println(sum);
        scan.close();
    }
}
