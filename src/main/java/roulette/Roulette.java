package roulette;

import rplayer.RPlayer;

import java.util.ArrayList;


public class Roulette {

    int max = 36;
    int min = 0;
    int range = max - min + 1;

    int maxAmountPlayer = 10;
    ArrayList<RPlayer> players = new ArrayList<>();


    public boolean register (RPlayer rplayer){
        //max player check
        if (players.size() > maxAmountPlayer) throw new RuntimeException("Spiler anzahl ist vollständig");
        //Player hinzufügen
        players.add(rplayer);

        return true;
    }

    public int play(){
        int number = (int)(Math.random() * range) + min;

        force(number);

        return number;
    }

    public int force(int number){


        System.out.println("Roulette nummber: " + number);

        //check what kind of bet is done
        players.forEach(rPlayer -> {


            if (rPlayer.getEvenBet() != 0){
                int potentialBalance = rPlayer.getEvenBet() * 2;

                if (number%2 == 0){

                    System.out.println("player won even balance before play " + rPlayer.getBalance());
                    //player won
                    rPlayer.setBalance(rPlayer.getBalance() + potentialBalance);
                    System.out.println("player won even balance after play " + rPlayer.getBalance());

                }else System.out.println("player lost balance " + rPlayer.getBalance());



            } else if (rPlayer.getOddBet() != 0){
                int potentialBalance = rPlayer.getOddBet() * 2;

                if (number%2 != 0){

                    System.out.println("player won odd balance before play " + rPlayer.getBalance());
                    //player won
                    rPlayer.setBalance(rPlayer.getBalance() + potentialBalance);
                    System.out.println("player won odd balance after play " + rPlayer.getBalance());

                }else System.out.println("player lost odd balance " + rPlayer.getBalance());

            } else
                rPlayer.getNumberBet();
            //player won
            if(rPlayer.getNumberBetNumber() == number){
                int potentialBalance = rPlayer.getNumberBet() * 36;
                System.out.println("player won number balance before play " + rPlayer.getBalance());

                rPlayer.setBalance(rPlayer.getBalance() + potentialBalance);
                System.out.println("player won number balance after play " + rPlayer.getBalance());

            }else System.out.println("player lost balance " + rPlayer.getBalance());
            //player lost
        });

        //set bets back to 0
        players.forEach(rPlayer -> {
            rPlayer.setNumberBetNumber(0);
            rPlayer.setEven(0);
            rPlayer.setOddBet(0);
        });
        return number;
    }




    public Roulette() {
    }

}
