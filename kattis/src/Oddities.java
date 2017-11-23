import java.util.Scanner;

public class Oddities {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
            int x = scan.nextInt();
            if(x%2 == 0){
                System.out.println(x +" is even");
            }else{
                System.out.println(x +" is odd");
            }
        }
    }
}
