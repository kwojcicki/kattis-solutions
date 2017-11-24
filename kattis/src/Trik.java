import java.util.Scanner;

public class Trik {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String moves = scan.nextLine();
        int pos = 1;

        for(int i = 0 ; i < moves.length(); i++){
            pos = swap(moves.charAt(i), pos);
        }
        System.out.print(pos);
    }

    private static int swap(char move, int pos){
        if(move=='A'){
            if(pos==1) return 2;
            if(pos==2) return 1;
        }else if(move=='B'){
            if(pos==2) return 3;
            if(pos==3) return 2;
        }else if(move=='C'){
            if(pos==1) return 3;
            if(pos==3) return 1;
        }
        return pos;
    }

}
