package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

private final Logger logger = LoggerFactory.getLogger("simulation");
private final Player player;  //TODO add variable type
private  long numberToGuess; //TODO add variable type
Scanner sc = new Scanner(System.in);

public Simulation(Player player) {
    //TODO implement me
    this.player = player;
}

public void initialize(long numberToGuess) {
    //TODO implement me
    this.numberToGuess = numberToGuess;
}

/**
 * @return true if the player have guessed the right number
 */
private boolean nextRound() {
    //TODO implement me
    long nbr;
    System.out.println("Enter a number : ");
    nbr = sc.nextLong();

    if(nbr == numberToGuess){

        logger.log("You are right");
        return true;
    }
    else{
        if(nbr < numberToGuess)
            player.respond(false);

        if(nbr > numberToGuess)
            player.respond(true);

        logger.log("You are wrong");
        return false;
    }

}

public void loopUntilPlayerSucceed() {
    //TODO implement me
    while(nextRound() != true){
        nextRound();
    }
}
}
