package LabWeek5;

public class Q1CoinClass {

    private int randomCoinFlip;

    public void flipCoin(int flipCount) {

        for(int i=1; i<=flipCount; i++) {

             //Using Math.ceil to return rounded value
            // Will print 1 and 2 Randomly
            randomCoinFlip = (int) Math.ceil(Math.random() * 2);

            //Randomly chose 1 as "Print heads" and 2 will "Print Tails"
            if (randomCoinFlip == 1){
                System.out.println("Heads");
            }
            else {
                System.out.println("Tails");
            }
        }
    }

    public String getCoinStatus() {

        //Using ternary if statement to print it out
        return randomCoinFlip == 1? "Heads" : "Tails";
    }

}
