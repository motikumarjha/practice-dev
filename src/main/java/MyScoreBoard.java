import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyScoreBoard {
    public static void main(String[] args){
        List<String> playersList = Arrays.asList("Sachin", "MSD", "GG", "Kapil");
        //entity of Players
        playersScore(playersList);
       // getTopScores(playersList);
    }
    //function to add/edit the scores against each player

    public static ConcurrentHashMap<String, Integer> playersScore(List<String> playersList){
        ConcurrentHashMap<String, Integer> scoreMap = new ConcurrentHashMap<>();
        //TODO calculate the scores
        scoreMap.put(playersList.get(0), 200);
        scoreMap.put(playersList.get(2), 90);
        scoreMap.put(playersList.get(3), 100);
        scoreMap.put(playersList.get(4), 175);

        //add
        if(!(scoreMap.contains("Sri"))){
            scoreMap.put("Sri", 122);
        }

        return scoreMap;
    }
    //to fetch the top 10 scores
  /*  public static List<Integer> getTopScores(List<String> playersList){
        List<Integer> finalScoreArray = new ArrayList();
       Map<String, Integer> playerMap =  playersScore(playersList);
       for(Map.Entry<String,Integer> map : playerMap){
           int scoreArr = map.getValue();
           finalScoreArray.add(scoreArr);// {200, 90, 100, 175, 122...}
       }
        finalScoreArray.sort(); // 200 175 122 100 90 .......
       //subArray to print first 10 elements of the final List
        return finalScoreArray;
    }*/

}




