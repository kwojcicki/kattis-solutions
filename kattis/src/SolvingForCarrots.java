import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SolvingForCarrots {

    //Why does this question even exist
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        String[] firstLine = x.split(" ");
        int carrots = Integer.parseInt(firstLine[1]);

        scan.close();

        System.out.println(carrots);
    }
}
