package LabWeek5;

import java.util.HashMap;
import java.util.Map;

public class Q2CoinClass {

    private int randomCoinFlip;
    private HashMap<String,Integer> stringIntegerHashMap = new HashMap<String, Integer>();
    private int fourOccurencesOfTails;
    private int fiveOccurencesOfTails;

    public void flipCoinInGroups (){

        String[] coinGroup = new String[5];

        for (int x=1; x<=1024 ; x++) {
            for (int i=0; i<coinGroup.length; i++) {
                randomCoinFlip = (int) Math.ceil(Math.random() * 2);
                if (randomCoinFlip == 1) {
                    coinGroup[i] = "Heads";
                }
                else {
                    coinGroup[i] = "Tails";
                }
            }
            countNumberOfTailOccurences(coinGroup);
        }
    }

    public void countNumberOfTailOccurences(String[] coinGroup) {

        for (String coinValue : coinGroup){
            if (!stringIntegerHashMap.containsKey(coinValue)) {
                stringIntegerHashMap.put(coinValue, 1);
            }
            else {
                Integer getHashMapKey = stringIntegerHashMap.get(coinValue);
                if (getHashMapKey != null) {
                    getHashMapKey++;
                    stringIntegerHashMap.put(coinValue, getHashMapKey);
                }
            }
        }
        tallyResults(stringIntegerHashMap);
    }

    public void tallyResults(HashMap<String, Integer> stringIntegerHashMap) {

        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {

            if(entry.getValue() == 4) {
                fourOccurencesOfTails++;
            }
            else if (entry.getValue() == 5) {
                fiveOccurencesOfTails++;
            }
        }
        stringIntegerHashMap.clear();
    }

    public void getResults() {
        System.out.printf("4 Occurrences of Tails in Group: %d\n" +
                          "5 Occurrences of Tails in Group: %d", fourOccurencesOfTails, fiveOccurencesOfTails);
    }
}
