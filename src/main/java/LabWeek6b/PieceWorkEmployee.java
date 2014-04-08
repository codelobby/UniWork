package LabWeek6b;

public class PieceWorkEmployee extends Employee {

    private double weeklyPay;

    // adding extra parameters to constructor, so when an instance of PieceWorkEmployee is created, it will ask for additional values required
    // to calculate pieceworker salary

    public PieceWorkEmployee(String first, String last, String ssn, int target, int pieceMade, double paymentPerPiece, double penaltyAmount) {
        super(first, last, ssn);
        setWeeklyPay(target, pieceMade, paymentPerPiece, penaltyAmount);
    }

    public void setWeeklyPay(int target, int piecesMade, double paymentPerPiece, double penaltyAmount) {

        if (target == piecesMade) {
            weeklyPay = piecesMade * paymentPerPiece;
        }
        else if (target > piecesMade) {
            weeklyPay = (piecesMade * paymentPerPiece) - penaltyAmount;
        }
        else if (target < piecesMade) {
            weeklyPay = (piecesMade * paymentPerPiece) + (paymentPerPiece * 0.10 * (piecesMade - target));
        }
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklyPay();
    }

    @Override
    public String getID() {
        return null;
    }
}
