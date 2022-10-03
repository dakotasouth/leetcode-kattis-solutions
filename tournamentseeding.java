import java.util.*;
public class tournamentseeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnds = sc.nextInt();
        int rtDiff = sc.nextInt();

        Map<Integer,List<Integer>> players = new HashMap<>();
        Map<Integer,List<Integer>> nextRnd = new HashMap<>();

        //create players list
        for(int i=0; i<Math.pow(2,rnds);i++){
            players.put(sc.nextInt(),new ArrayList<>());;
        }

        //add all players in range with each player to thier list
        for(int player: players.keySet()){
            for(int i = 1; i< rtDiff; i++){
                if(players.keySet().contains(player - i)){
                    //get current list of players in range and add new player
                    List<Integer> newList = players.get(player);
                    newList.add(i);
                    players.put(player, newList);
                }
            }
        }
        //need to check if nothing happened in one loop
        int inRangeSize = 0;

        for(int i=0;i<rnds;i++){
            while(!players.isEmpty()){
                int p1 = players.get(0);
                int p2 = players.get(players.size()-1);
                //might not remove correctly
                players.remove(0); players.remove(players.size()-1);

                if(p2-p1 <= rtDiff) close++;
                System.out.println(p1 + " " + p2);
                nextRnd.add(p2); Collections.sort(nextRnd);
            }
            players = nextRnd;
            nextRnd.clear();

        }

        System.out.println(close);
    }
}
