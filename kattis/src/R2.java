import java.util.Scanner;

public class R2 {

	// Krystian R2
	//	public static void main(String[] args) throws IOException {
	//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//		String[] s = in.readLine().split(" ");
	//		int r1 = Integer.parseInt(s[0]);
	//		int s1 = Integer.parseInt(s[1]);
	//		System.out.println((2 * s1 - r1));
	//	}

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
