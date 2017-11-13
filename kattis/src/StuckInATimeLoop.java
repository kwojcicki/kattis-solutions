
import java.util.Scanner;
public class StuckInATimeLoop {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0 ; i < num ; i++){
            System.out.println((i+1) + " Abracadabra");
        }
    }
}