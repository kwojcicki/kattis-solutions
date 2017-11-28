import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bard {
    public static void main(String[]args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int E = Integer.parseInt(in.readLine());

        //A map that maps villagers to the songs they know
        Map<Integer, Set<Integer>> villager = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            villager.put(i+1, new HashSet<>());
        }
        for(int night = 0 ; night < E ; night++){
            String[] line = in.readLine().split(" ");
            Set<Integer> villagersPresent = new HashSet<>();
            for(int j = 1 ; j < line.length; j++){
                villagersPresent.add(Integer.parseInt(line[j]));
            }
            singSong(villager,villagersPresent, night);
        }
        for(int i = 0 ; i < N; i++){
            if(villager.get(i+1).size() == villager.get(1).size()){
                System.out.println(i+1);
            }
        }
    }

    public static void singSong(Map<Integer,Set<Integer>> v, Set<Integer> singers, int night){
        //If we have a bard tonight, that means the all villagers of that night
        //will know an extra song from the bard and no other songs are exchanged
        if(singers.contains(1)){
            for(int i : singers){
                v.get(i).add(night);
            }
        }else{
            //Villagers sing all songs and exchange what they know
            Set<Integer> songsVillagersKnow = new HashSet<>();
            for(int s: singers){
                songsVillagersKnow.addAll(v.get(s));
            }
            for(int s: singers) {
                v.get(s).addAll(songsVillagersKnow);
            }
        }
    }

}
