import java.util.Scanner;

public class R2 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] firstLine = s.split(" ");
        int r1 = Integer.parseInt(firstLine[0]);
        int mean = Integer.parseInt(firstLine[1]);
        int r2 = 2*mean - r1;
        System.out.print(r2);
    }

}
