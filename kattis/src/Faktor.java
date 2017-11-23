import java.util.Scanner;

public class Faktor {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String l = scan.nextLine();
        String[] p = l.split(" ");
        int numPublished = Integer.parseInt(p[0]);
        int impactFactor = Integer.parseInt(p[1]);
        int bribes = numPublished * impactFactor - (numPublished-1);
        System.out.println(bribes);
    }
}
