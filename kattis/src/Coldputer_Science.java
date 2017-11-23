import java.util.Scanner;

public class Coldputer_Science {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum += Integer.parseInt(scan.next()) < 0 ? 1:0;
        }
        System.out.print(sum);
    }
}
