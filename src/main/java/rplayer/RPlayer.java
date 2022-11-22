package rplayer;

public class RPlayer {

    int balance = 0;
    int numberBet = 0;
    int numberBetNumber = 0;
    int oddBet = 0;
    int evenBet = 0;




    public boolean setNumber(int number, int bet){
        if (bet > balance) return false;

        //balance abziehen
        setBalance(balance - bet);

        //wette setzen
        setNumberBet(bet);
        setNumberBetNumber(number);
        return true;
    }

    public boolean setOdd(int bet){
        if (bet > balance) return false;

        //balance abziehen
        setBalance(balance - bet);

        //wette setzen
        setOddBet(bet);
        return true;
    }

    public boolean setEven(int bet){
        if (bet > balance) return false;

        //balance abziehen
        setBalance(balance - bet);

        //wette setzen
        setEvenBet(bet);

        return true;
    }




        public int getBalance() {
        return balance;
    }

    public int getNumberBetNumber() {
        return numberBetNumber;
    }

    public void setNumberBetNumber(int numberBetNumber) {
        this.numberBetNumber = numberBetNumber;
    }

    public int getNumberBet() {
        return numberBet;
    }

    public void setNumberBet(int numberBet) {
        this.numberBet = numberBet;
    }

    public int getOddBet() {
        return oddBet;
    }

    public void setOddBet(int oddBet) {
        this.oddBet = oddBet;
    }

    public int getEvenBet() {
        return evenBet;
    }

    public void setEvenBet(int evenBet) {
        this.evenBet = evenBet;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public RPlayer(int balance) {
        this.balance = balance;
    }
}
