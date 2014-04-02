package LabWeek5;

public class Q1CoinClass {

    private int randomCoinFlip;

    public void flipCoin(int flipCount) {

        for(int i=1; i<=flipCount; i++) {

            randomCoinFlip = (int) Math.ceil(Math.random() * 2);

            if (randomCoinFlip == 1){
                System.out.println("Heads");
            }
            else {
                System.out.println("Tails");
            }
        }
    }

    public String getCoinStatus() {

        return randomCoinFlip == 1? "Heads" : "Tails";
    }

}
