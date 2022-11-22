package org.example;

import roulette.Roulette;
import rplayer.RPlayer;

public class Game {

    public static void main(String[] args) {
        RPlayer alice = new RPlayer(200);

        Roulette roulette = new Roulette();
        roulette.register(alice);
        alice.setEven(10);


        roulette.play();







    }

}
